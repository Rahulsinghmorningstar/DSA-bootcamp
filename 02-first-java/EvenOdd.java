// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

class EvenOdd {
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);  //Scanner object
        int input = sc.nextInt();  //input from user

        //If-else condition to check whether input is Even or Odd.
        if ( input%2 == 0 ) {    
            System.out.println("Even");
        } 
        else System.out.println("Odd");

    }
}