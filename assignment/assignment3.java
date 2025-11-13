package assignment;

public class assignment3 {

    public static void isOddSum(int arr[]){
        int[] oddint=new int[arr.length];
         int count=0,sum=0;
          for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
               oddint[count]=arr[i];
               sum=sum+arr[i];
               count++;
            }
          }
          System.out.print("Odd integers are:");
          for(int i=0;i<count;i++){
            System.out.print(oddint[i]+" ");
          }
          System.out.println();
          System.out.println("Total sum: "+sum);
    }

    public static void main(String[] args) {
        int arr[]={10,-4,0,-13,5,33};
        isOddSum(arr);
    }
    
}
