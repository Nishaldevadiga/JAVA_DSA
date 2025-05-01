package Stacks;

public class NextGreater {
//Brute Force
    public static void NextGreater(int arr[],int nextgtr[]){
        for(int i=0;i<arr.length;i++){
           int ele=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                   ele=arr[j];
                   break;
                }
            }
            nextgtr[i]=ele;
        }
    }

    public static void main(String[] args) {
        int arr[]={2,8,0,1,3};
        int nextgtr[]=new int[arr.length];

        NextGreater(arr,nextgtr);

        for(int i=0;i<nextgtr.length;i++){
            System.out.println(nextgtr[i]);

        }
    }
    
}
