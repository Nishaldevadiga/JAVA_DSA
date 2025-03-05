package Recursion;

public class FirstOccurence {

    public static int FirstOcuur(int arr[], int key, int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1; 
        }

        return FirstOcuur(arr, key, i+1);

    }

    public static void main(String[] args) {
        int arr[]={1,5,6,7};
        System.out.println(FirstOcuur(arr, 6, 0));
    }
    
}
