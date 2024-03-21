import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        double result = 0; 

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2; 
                } 
                else {
                    System.out.println("Error: Division by zero!");
                    return; 
                }
                break;

            default:
                System.out.println("Error: Invalid operator!");
                return; 
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
