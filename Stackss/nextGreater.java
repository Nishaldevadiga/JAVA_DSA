package Stackss;

public class nextGreater {

    //brute force
    public static void NextGreater(int arr[]){
     int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int greater=arr[j];
                    newarr[i]=greater;
                    break;
            }
            }
        }
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[]={6,8,0,1,3};
        NextGreater(arr);

             
    }
    
}
