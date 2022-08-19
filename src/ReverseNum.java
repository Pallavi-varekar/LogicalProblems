import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num , reversed = 0;

        System.out.print("Enter number to reverse it : ");

        num = sc.nextInt();
        if(num>0) {

            while(num != 0) {

                int digit = num % 10;

                reversed = reversed * 10 + digit;

                num /= 10;


            }
            System.out.println("Reversed Number: " + reversed);
        }
        else {
            System.out.println("invalid number");
        }

    }

}
