package Arrays;

public class TwoPointerDup {
public static int RemoveDup(int arr[]){

    int i=0;
    for(int j=1;j<arr.length;j++){
        if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
        }
    }

    for(int k=0;k<i;k++){
        System.out.println(arr[k]+" ");
    }
    return i+1;
}
    public static void main(String args[]){
        int[] arr={1,1,1,2,2,3};
        System.out.println(RemoveDup(arr));
    }
    
}
