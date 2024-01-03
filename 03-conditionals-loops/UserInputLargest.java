// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class UserInputLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, largest = 0;
        while ((num = sc.nextInt())!=0) {
            if(num>largest) {
                largest = num;
            }
        } System.out.println(largest);
        sc.close();
    }
}
