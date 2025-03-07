package DivideConquer;

public class quicksort {

    public static void QuickSort(int arr[],int si, int ei){
        //base case
        if(si>=ei){
            return;
        }

        

        //partition
        int partidx=Partition(arr,si,ei);
        QuickSort(arr,si,partidx-1);
        QuickSort(arr, partidx+1, ei);
    }

    public static int Partition(int arr[],int si, int ei){

        int pivot=arr[ei];

        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
            i++;
            int temp=arr[i];
            arr[i]=arr[ei];
            arr[ei]=temp;
        
        return i;
    }

    public static void main(String[] args) {
        int arr[]={2,6,8,3,-1};
        QuickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}
    }
    
}
