package Arrays;

import java.util.HashMap;

public class Moores {
    // O(n) TC and 0(n) SC
    public static int Max(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (map.get(arr[i]) > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;

    }

    public static int Moores(int arr[]) {
        int count = 0;
        int ele = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }

        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return ele;
        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 3, 3, 1, 3, 2 };

        // System.out.println(Max(arr));
        System.out.println(Moores(arr));

    }

}
