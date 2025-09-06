package assignment;

import java.util.Scanner;
import java.util.*;

public class assignment1 {

    public static void isPerfectSquare(int n) {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        double sqrt = 0;
        while (isContinue) {
            System.out.println("Enter the number");
            int a = sc.nextInt();
            if (a < 0) {
                System.out.println("Not a Valid number");
            } else {
                sqrt = Math.sqrt(a);
                if (sqrt == (int) sqrt) {
                    System.out.println("perfect square number");
                } else {
                    System.out.println("Not a perfect square number");
                }
            }
            System.out.println("Do you want to try again?: Yes or No");
            String msg = sc.nextLine();
            if (!msg.equalsIgnoreCase("Yes")) {
                isContinue = false;
            }
        }
        sc.close();
    }

    public static void main(String args[]) {
        int num = 5;
        isPerfectSquare(num);

    }

}
