import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if(num2 > num1){
            System.out.println(num2 + " is larger");
        } else{
            System.out.println("These numbers are equal");
        }

        scanner.close();
    }
}
