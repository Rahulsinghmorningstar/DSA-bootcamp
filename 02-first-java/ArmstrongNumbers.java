// To find Armstrong Number between two given number.

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        for (int i = left; i <= right; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int lastdigit = temp % 10;
                sum += Math.pow(lastdigit, 3);
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
