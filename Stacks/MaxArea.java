package Stacks;

import java.util.*;

import Stacks.Stacks.stack;

public class MaxArea {

    public static int CalArea(int arr[]) {
        // Area=width*height

        // to calculate width

        // nsr
        int nsr[] = new int[arr.length];
        // nsl
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        // calculating nsr
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s.clear();
        // calculating nsl

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // calculating area
        int area = 0;
        for (int i = 0; i < arr.length; i++) {

            area = Math.max(area, arr[i] * (nsr[i] - nsl[i] - 1));
        }

        return area;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4 };
        System.out.print(CalArea(arr));

    }

}
