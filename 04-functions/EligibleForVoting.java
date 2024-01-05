import java.util.Scanner;

public class EligibleForVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        EligibleForVoting obj = new EligibleForVoting();
        System.out.println(obj.checkEligibility(age));
        sc.close();
    }
    public boolean checkEligibility (int n) {
        if (n < 18) {
            return false;
        } else return true;
    }
}
