import java.util.Scanner;

public class temperature {
    static void tempConversion(int temperature, int conversion) {
        if (conversion == 0) {
            int f = (temperature * 9/5) + 32 ;
            System.out.println("temperature in Fahrenheit : " +f +"f");
        }
        else if(conversion == 1) {
            int c = (temperature - 32) * 5/9 ;
            System.out.println("temperature in Celsius : " +c +"c");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter 0 for find temerature in fahrenheit & 1 for to find temperature in celsius : ");
        Scanner input = new Scanner(System.in);
        int conversion = input.nextInt();

        System.out.println("Enter temperature : ");
        int temperature = input.nextInt();
        tempConversion(temperature, conversion);


    }

}
