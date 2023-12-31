// Area of Isoceles Traingle

import java.util.Scanner;

public class AreaOfIsocelesTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double base = sc.nextDouble();

        double areaOfIsocelesTraingle = 0.5 * base * height;
        System.out.println(areaOfIsocelesTraingle);
        sc.close();
    }
}