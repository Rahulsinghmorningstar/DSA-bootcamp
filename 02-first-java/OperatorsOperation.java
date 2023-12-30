// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class OperatorsOperation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char operator = sc.next().charAt(0);

        double value = 0;

        if (operator == '+') {
            value = num1 + num2;
        } else if (operator == '-') {
            if(num1>num2) {
                value = num1 - num2;
            } else value = num2 - num1;
        } else if (operator == '*') {
            value = num1 * num2;
        } else if (operator == '/') {
            value = num1/num2;
        } else {
            System.out.println("Please enter correct operator");
        }

        System.out.println(value);
    }
}
