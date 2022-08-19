import java.util.Scanner;

public class SquareRoot {
    static double epsilon = Math.pow(2, -52);
    static void squareRoot(int c) {
        int t=c;
        while(Math.abs(t-(c/t)) > epsilon) {
            t = ((c/t)+ t)/2;
        }
        System.out.println("the square root of given value is : " + t);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non negative number : ");
        int c = input.nextInt();
        squareRoot(c);
    }}
