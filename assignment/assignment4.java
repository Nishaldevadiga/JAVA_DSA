package assignment;

public class assignment4 {

    public static int findSumCube(int n) {

        if (n == 1) {
            return 1;
        }
        return n * n * n + findSumCube(n - 1);

    }

    public static void main(String args[]) {
        int n = 3;
        System.out.print(findSumCube(n));
    }

}
