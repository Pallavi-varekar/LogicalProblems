import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {

    
    Scanner num = new Scanner(System.in);
        System.out.print("Type to `start` to Start the Stopwatch : ");
    String str = num.next().toLowerCase();

    long start = System.currentTimeMillis();
        if(str.equals("start"))

    {
        System.out.print("Type to `stop` to Stop the Stopwatch : ");
        String str1 = num.next().toLowerCase();

        while (!str1.equals("stop")) {
            System.out.println("Type to `stop` to Stop the Stopwatch : ");
            str1 = num.next().toLowerCase();
        }
        long stop = System.currentTimeMillis();
        long timeElapesd = stop - start;
        System.out.println("Time = " + timeElapesd + " ms");

    } else
            System.out.println("Input wrong only Type to `start` to Start the Stopwatch : ");


}
}
