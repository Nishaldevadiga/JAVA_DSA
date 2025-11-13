package assignment;

import java.util.Scanner;

public class assignment2 {

    public static void isDivisibleByThree() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Please Enter the number");
            int num = sc.nextInt();
            if (num <= 2) {
                System.out.println("Not divisible by 3");
            } else if (num % 3 == 0) {
                System.out.println("Divisible by 3");
            } else {
                System.out.println("Not divisible by 3");
            }
        }
    }

    public static void main(String[] args) {

        isDivisibleByThree();

    }

}
