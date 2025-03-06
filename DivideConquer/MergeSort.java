package DivideConquer;

public class MergeSort {

    public static void MerSort(int arr[],int si,int ei){
        //edge case
        if(si>=ei){
            return;
        }
     //mid
     int mid=(si+ei)/2;
        //left
        MerSort(arr, si, mid);
        MerSort(arr, mid+1, ei);

        Merge(arr,si,ei,mid);

    }
        public static void Merge(int arr[],int si, int ei, int mid){
              int temp[]=new int[ei-si+1];
              
              int k=0;
               int i=si;
               int j=mid+1;
              while(i<=mid && j<=ei){
                  if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                  }else{
                    temp[k]=arr[j];
                    j++;
                  }
                  k++;
              }

              while(i<=mid){
                temp[k++]=arr[i++];
              }

              while(j<=ei){
                temp[k++]=arr[j++];
              }
   
              for(int m=0, p=si; m< temp.length;m++,p++){
               arr[p]=temp[m];
              }

        }
    public static void main(String[] args) {
        int[] arr={7,4,3,2};
        int ei=arr.length;
      MerSort(arr, 0,ei-1);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
