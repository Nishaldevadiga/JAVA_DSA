package Recursion;

public class FirstOccurence {

    public static int FirstOcuur(int arr[], int key, int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length){
            return -1; 
        }

        return FirstOcuur(arr, key, i+1);

    }

    public static int LastOccur(int arr[],int key, int i){

        if(i==arr.length){
            return -1;
        }
        int insFound=LastOccur(arr, key, i+1);
        if(insFound == -1 && arr[i]==key){
            return i;
        }
         
         return insFound;
    }

    public static void main(String[] args) {
        int arr[]={1,5,6,7,5};
        System.out.println(LastOccur(arr, 5, 0));
    }
    
}
