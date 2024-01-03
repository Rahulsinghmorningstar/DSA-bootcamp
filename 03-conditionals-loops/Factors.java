// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
