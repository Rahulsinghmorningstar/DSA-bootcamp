// To find out whether the given String is Palindrome or not. 

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder revStr = new StringBuilder();
        revStr.append(input);
        revStr.reverse();
        if (input.equals(revStr.toString())) {
            System.out.println("Palindrome");
        } else System.out.println("Not palindrome");
        sc.close();
    }
}
