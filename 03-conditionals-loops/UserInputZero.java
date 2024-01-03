// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class UserInputZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        while((num = sc.nextInt())!=0) {
            sum += num;
        } System.out.println(sum);
        sc.close();
    }
}
