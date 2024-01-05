import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        MaxMin obj = new MaxMin();
        System.out.println(obj.max(num1, num2, num3));
        System.out.println(obj.min(num1, num2, num3));
        sc.close();
    }

    int max(int n1, int n2, int n3) {
        return Math.max(Math.max(n1, n2), n3);
    }
    int min(int n1, int n2, int n3) {
        return Math.min(Math.min(n1, n2), n3);
    }
}
