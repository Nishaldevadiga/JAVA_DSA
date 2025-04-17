package Arrays;

public class ArraySelf {

    public static void Conversion(int arr[]){
     int[] left=new int[arr.length];
     int[] right=new int[arr.length];
     int[] result=new int[arr.length];
        left[0]=1;
        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]*arr[i-1];
            System.out.print(left[i]);
        }

        right[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
            System.out.print(right[i]);
        }

         for(int i=0;i<arr.length;i++){
            result[i]=left[i]*right[i]; 
         }

         for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
         }


        }

    public static void main(String[] args) {
        int arr[]={3,2,1,6};
        Conversion(arr);
    }
    
}
