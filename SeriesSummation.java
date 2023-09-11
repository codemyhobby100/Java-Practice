import java.util.Scanner;

public class SeriesSummation {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of x
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        double sum = 1; // Initialize the sum with the first term (1)

        // Iterate from i = 1 to 5 to calculate each term of the series
        for (int i = 1; i <= 5; i++) {
            // Calculate the term of the series using the formula x^i/i!
            double term = Math.pow(x, i) / factorial(i);
            // Add the term to the sum
            sum += term;
        }

        // Output the final sum of the series
        System.out.println("Sum of the series: " + sum);

        scanner.close();
    }

    // Method to calculate the factorial of a number
    private static int factorial(int n) {
        int fact = 1;
        // Iterate from 1 to n and multiply the numbers to calculate the factorial
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
