package Arrays;

public class AddDigit {

    public static void Add(int[] arr){

    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]<9){
            arr[i]++;
            return;
        }
        arr[i]=0;
    }

    int result[]=new int[arr.length+1];
    result[0]=1;
    }

    public static void main(String args[]){
        int arr[]={1,2,9};
        Add(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
