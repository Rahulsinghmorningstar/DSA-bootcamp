import java.util.Scanner;

public class Greetings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);  //Scanner object
        String name = sc.nextLine();   //input from user

        System.out.println("Hello " + name + ", " + "Greetings for the day!");  //print statement
    }
}
