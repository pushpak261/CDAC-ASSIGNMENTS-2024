import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a number to get weekday : ");
        int weekdayNumber = Sc.nextInt();

        String weekday;

        switch (weekdayNumber) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;

            default:
                weekday = "please enter correct detail";
                break;
        }

        
        System.out.println("Day is " + weekday);

        Sc.close(); 
    }
}
