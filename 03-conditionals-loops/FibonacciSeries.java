import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num<1){
            System.out.println("Invalid series");
        }

        int prev1 = 1;
        int prev2 = 0;

        if (num > 1) {
            for (int i = 1; i < num; i++) {
                if(i>2){
                    int n = prev1 + prev2;
                    prev2 = prev1;
                    prev1 = num;
                    System.out.print(n + " ");

                }
                if(i==1) {
                    System.out.print(prev2);
                }
                if(i==2) {
                    System.out.print(prev1);
                }
            }
        }
    }
}
