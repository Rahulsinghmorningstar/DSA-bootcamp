// Area Of Circle Java Program

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius of circle: ");
        double radius = sc.nextDouble();

        double areaOfCircle = 3.14159 * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + areaOfCircle);
        sc.close();
    }

}