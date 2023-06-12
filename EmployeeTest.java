public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee("John", "Doe", 5000);
        Employee employee2 = new Employee("Jane", "Smith", 6000);

        // Display yearly salary for each employee
        System.out.println("Yearly salary of employee1: $" + employee1.getYearlySalary());
        System.out.println("Yearly salary of employee2: $" + employee2.getYearlySalary());

        // Give each employee a 10% raise
        employee1.giveRaise(10);
        employee2.giveRaise(10);

        // Display yearly salary after raise for each employee
        System.out.println("Yearly salary of employee1 after raise: $" + employee1.getYearlySalary());
        System.out.println("Yearly salary of employee2 after raise: $" + employee2.getYearlySalary());
    }
}
