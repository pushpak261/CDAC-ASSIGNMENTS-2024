
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you Marks: ");
        int marks=sc.nextInt();

        String grade;

        if (marks > 90) {
            grade = "Your Grade is A";
        } else if (marks >= 80 && marks < 90) {
            grade = "Your Grade is B";
        } else if (marks >= 60 && marks < 80) {
            grade = "Your Grade is C";
        } else if (marks >= 50 && marks < 60) {
            grade = "Your Grade is D";
        } else {
            grade = "Your Grade is F";
        }

        System.out.println(grade);
        sc.close();
    }
}
