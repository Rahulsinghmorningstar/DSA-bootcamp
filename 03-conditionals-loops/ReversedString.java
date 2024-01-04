import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedString = sb.toString();

        System.out.println(reversedString);
        sc.close();
    }
}
