// Factorial Program In Java

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int num) {
        if(num == 0 || num==1){
            return 1;
        } else return num * factorial(num-1);
    }
}
