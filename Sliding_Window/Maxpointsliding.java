package Sliding_Window;

public class Maxpointsliding {

    public static int Maxpoints(int arr[], int k) {
        int l = 0;
        int r = k - 1;

        int lsum = 0;
        int rsum = 0;
        int rightidx = arr.length - 1;
        for (int i = 0; i <= r; i++) {
            lsum += arr[i];
        }
        int Maxsum = lsum;

        while (r>=0) {
            lsum = lsum - arr[r];
            r--;
            rsum = rsum + arr[rightidx];
            rightidx--;
            Maxsum = Math.max(Maxsum, lsum + rsum);
        }
        return Maxsum;
    }

    public static void main(String args[]) {

        int arr[] = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };

        int result=Maxpoints(arr, 4);
        System.out.println(result);

    }
}
