import java.util.Scanner;

public class MonthlyPayment {
    static void monthlyPayment(double P, double Y, double R) {
        double n = 12*Y;
        double r = R/(12*100);
        double payment = P*r/(1-Math.pow((1+r),-n));
        System.out.println("Monthly Payment : "+payment);
    }

    public static void main(String[] args) {
        System.out.println("Calculate Monthly Payment ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal loan amount : ");
        double p = input.nextInt();
        System.out.println("Enter year for pay off : ");
        double y = input.nextInt();
        System.out.println("Enter percent interest : ");
        double r = input.nextInt();
        monthlyPayment(p, y, r);


    }

}
