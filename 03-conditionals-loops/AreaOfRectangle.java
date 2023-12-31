// Area Of Rectangle

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double width = sc.nextDouble();

        double areaOfRectangle = width * height;
        System.out.println(areaOfRectangle);
        sc.close();
    }
}
