import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double unit = sc.nextDouble();
        System.out.println(electricityBill(unit));
        sc.close();
        
    }
    public static double electricityBill (double unit) {

        if(unit<=100) {
            return unit*10;
        }
        else if(unit<=200){
            return (100*10) + ((unit-100)*15);
        }
        else if(unit<=300){
            return (100*10) + ((unit-100)*15) + ((unit-200)*20);
        }
        else if(unit>=301){
            return (100*10) + ((unit-100)*15) + ((unit-200)*20) + ((unit-300)*25);
        }
        else return 0;
    }
}
