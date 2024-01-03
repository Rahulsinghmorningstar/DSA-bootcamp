// Area Of Rhombus

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter bigger digonal: ");
        double bd = sc.nextDouble();
        System.out.println("Please enter smaller digonal: ");
        double sd = sc.nextDouble();
        double areaOfRhombus = 0.5 * (bd * sd);
        System.out.println("Area of Rhombus is: " + areaOfRhombus);
        sc.close();
    }
}
