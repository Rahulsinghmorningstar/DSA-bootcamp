// Area Of Parallelogram

import java.util.Scanner;

public class AreaOfParellelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double base = sc.nextDouble();

        double areaOfParellelogram = height * base;
        System.out.println(areaOfParellelogram);
        sc.close();
    }
}
