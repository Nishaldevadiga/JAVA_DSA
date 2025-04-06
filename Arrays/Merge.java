package Arrays;

public class Merge {

    public static void merge(int arr1[], int arr2[]){
        int index=arr1.length-1;
        int p2=arr2.length-1;
        int p1=(index-p2)-1;


        while(p2>=0){
            if(p1>=0 && arr1[p1]>arr2[p2]){
                arr1[index]=arr1[p1];
                p1--;
            }else{
                arr1[index]=arr2[p2];
                p2--;
            }
            index--;
        }


    }
public static void main(String[] args) {
    int[] arr1={1,2,5,0,0,0};
    int[] arr2={2,3,4};

    merge(arr1, arr2);

    for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+" ");
    }
}
}