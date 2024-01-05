import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.findEvenOdd(num);
    }
    public void findEvenOdd(int n) {
        if (n%2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");
    }
}