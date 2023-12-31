// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inr = sc.nextDouble();
        double usd = inr * 83.19;

        System.out.println(usd);
        sc.close();
    }
}
