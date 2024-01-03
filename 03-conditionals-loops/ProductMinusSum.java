// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class ProductMinusSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int product = 1;
        int sum = 0;
        int temp = num;
        int difference;

        //sum
        while (num > 0) {
            int digit = num %10;
            sum = sum + digit;
            num /= 10;
        }

        //product
        while (temp != 0) {
            product *= temp %10;
            temp /= 10;
        }

        difference = product - sum;

        System.out.println("difference between product and sum of given integer: " + difference);

        sc.close();
    }    
}
