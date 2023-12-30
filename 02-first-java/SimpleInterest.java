// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("principal: ");
        double principal = sc.nextDouble();
        System.out.println("rate: ");
        float rate = sc.nextFloat();
        System.out.println("time: ");
        float time = sc.nextFloat();

        double SI = principal * rate * time;
        System.out.println("Simple Interest: " + SI);
    }
}
