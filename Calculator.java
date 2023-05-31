import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //The scanner allows the computer prompt the user to input a value
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for the first value
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        // Prompt the user for the second value
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double quotient = (double) num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}
