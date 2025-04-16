package SubArray;

public class Longest {

    public static int LongestSubarray(int arr[], int k) {

        int l = 0, r = 0, maxlen = 0, sum = 0;
        while (r < arr.length) {
            sum += arr[r];
            if (sum == k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            while (sum > k && l <= r) {

                sum = sum - arr[l];
                l++;
            }
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1 };
        int result = LongestSubarray(arr, 3);
        System.out.print(result);
    }

}
