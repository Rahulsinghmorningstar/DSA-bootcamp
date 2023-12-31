// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<1) {
            System.out.println("Invalid Series");
        }

        int prev1 = 1;
        int prev2 = 0;

        for (int i = 1; i <= n; i++) {
            if(i > 2) {
                int num = prev1 + prev2;
                prev2 = prev1;
                prev1 = num;
                System.out.print(num + " ");
            }

            if (i ==1) {
                System.out.print(prev2 + " ");
            }
            if (i ==2) {
                System.out.print(prev1 + " ");
            }
        }

        sc.close();
    }
}
