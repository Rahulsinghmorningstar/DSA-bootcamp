// Area of Traingle

import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double base = sc.nextDouble();

        double areaOfTraingle = 0.5 * base * height;
        System.out.println(areaOfTraingle);
        sc.close();
    }
}
