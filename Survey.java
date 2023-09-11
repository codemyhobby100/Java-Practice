import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total number of people surveyed
        System.out.print("Enter the total number of people surveyed: ");
        int totalPeople = scanner.nextInt();

        int childrenCount = 0; // Variable to count the number of children
        int oldPeopleCount = 0; // Variable to count the number of old people

        // Iterate over each person's information
        for (int i = 1; i <= totalPeople; i++) {
            System.out.println("Person " + i);
            System.out.print("Enter the age: ");
            int age = scanner.nextInt();

            // Check the age and update the respective counts
            if (age < 18) {
                childrenCount++; // Increment the children count if the age is less than 18
            } else if (age >= 60) {
                oldPeopleCount++; // Increment the old people count if the age is 60 or more
            }
        }

        // Output the final counts of children and old people
        System.out.println("Number of children: " + childrenCount);
        System.out.println("Number of old people: " + oldPeopleCount);

        scanner.close();
    }
}
