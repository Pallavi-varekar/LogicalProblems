public class DayOfClass {
    static void dayOfWeek(int year, int month, int date) {
        int Y = year-(14-month)/12;
        int X = Y+Y/4-Y/100+Y/400;
        int M = month+12*((14-month)/12)-2;
        int D = (date+X+31*M/12)%7;
        System.out.println("The day is : "+D);
        switch(D) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }}
}
