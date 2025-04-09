package Sliding_Window;

public class Maxpoints {

    public static int Maxpoints(int arr[], int k) {

        int l = 0;
        int r = k - 1;
        int n = arr.length - 1;
        int sum = 0;
        int Maxsum = 0;
        if (arr.length == 0) {
            return 0;
        }
     
        for (int i = 0; i <=r; i++) {
            sum += arr[i];
        }
        if(r==n){
            return sum;
        }
        while (r < n) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            Maxsum = Math.max(sum, Maxsum);
        }
        return Maxsum;
    }

    public static void main(String[] args) {
        int arr[] = { 5,6,7,1,10};

        int n = 4;
        int result=Maxpoints(arr, n);
        System.out.println(result);

    }

}
