import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        int temp;               //take two variable temp and isaprime
        boolean isPrime=true;

        Scanner scan= new Scanner(System.in);   //create object for scanner class

        System.out.println("Enter any number:");

        int num=scan.nextInt();

        for(int i=2;i<num;i++) {

            temp=num%i;
            if(temp==0) {

                isPrime=false;
                break;
            }
        }

        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }

}
