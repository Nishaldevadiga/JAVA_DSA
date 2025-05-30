package Stackss;

import java.util.Stack;

public class nextGreater {

    // brute force
    public static void NextGreater(int arr[]) {
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int greater = arr[j];
                    newarr[i] = greater;
                    break;
                }
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }

    // using stack approach o(n)
    public static void NextGreaterStack(int arr[]) {
        int newarr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                newarr[i] = -1;
            } else {
                newarr[i] = arr[s.peek()];
            }

            s.push(i);
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };
        // NextGreater(arr);
        NextGreaterStack(arr);

    }

}
