import java.util.Scanner;

public class VarianceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of items (N)
        System.out.print("Enter the number of items (N): ");
        int n = scanner.nextInt();

        // Create an array to store the N items
        double[] items = new double[n];

        // Prompt the user to enter N items
        System.out.println("Enter the " + n + " items:");
        for (int i = 0; i < n; i++) {
            items[i] = scanner.nextDouble();
        }

        // Calculate the mean of the items
        double mean = calculateMean(items);

        // Calculate the variance of the items
        double variance = calculateVariance(items, mean);

        // Output the calculated variance
        System.out.println("Variance: " + variance);

        scanner.close();
    }

    // Method to calculate the mean of the items
    public static double calculateMean(double[] items) {
        double sum = 0;

        // Calculate the sum of all items
        for (double item : items) {
            sum += item;
        }

        // Divide the sum by the number of items to get the mean
        return sum / items.length;
    }

    // Method to calculate the variance of the items
    public static double calculateVariance(double[] items, double mean) {
        double sumOfSquaredDifferences = 0;

        // Calculate the sum of squared differences from the mean
        for (double item : items) {
            double difference = item - mean;
            sumOfSquaredDifferences += difference * difference;
        }

        // Divide the sum by the number of items to get the variance
        return sumOfSquaredDifferences / items.length;
    }
}
