package DivideConquer;

public class sortandrotate {
public static int Searchs(int arr[],int si, int ei, int target){

    //edge case
    if(si>ei){
        return -1;
    }

    //calculate mid
    int  mid=(si+ei)/2;

    //check for mid
if(arr[mid]==target){
    return mid;
}

    //calculate where mid lies
    if(arr[si]<=arr[mid]){
     if(arr[si]<=target && arr[mid]>target){
        return Searchs(arr, si, mid-1, target);
     }else{
        return Searchs(arr, mid+1, ei, target);
     }
    }else{

        if(target<=arr[ei] && target>arr[mid]){
            return Searchs(arr, mid+1, ei, target);
        }else{
            return Searchs(arr, si, mid-1, target);
        }

    }
}
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
       int index=Searchs(arr,0,arr.length-1,5);
       System.out.println(index);
    }

    
}
