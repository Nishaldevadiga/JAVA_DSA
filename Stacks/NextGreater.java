package Stacks;

import java.util.Stack;

public class NextGreater {
    // Brute Force
    public static void NextGreater(int arr[], int nextgtr[]) {
        for (int i = 0; i < arr.length; i++) {
            int ele = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    ele = arr[j];
                    break;
                }
            }
            nextgtr[i] = ele;
        }
    }

    // stacks to solve with optimized TC
    public static void NextGreateropt(int arr[], int nextgtr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int greater = -1;
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                greater = -1;
            } else {
                greater = arr[s.peek()];
            }
            nextgtr[i] = greater;
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 0, 1, 3 };
        int nextgtr[] = new int[arr.length];

        NextGreateropt(arr, nextgtr);

        for (int i = 0; i < nextgtr.length; i++) {
            System.out.println(nextgtr[i]);

        }
    }

}
