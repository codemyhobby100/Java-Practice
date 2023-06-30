public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(6, 12, 2023);

        // Display the initial date
        System.out.print("Initial date: ");
        date.displayDate();

        // Update the date using setter methods
        date.setMonth(9);
        date.setDay(30);
        date.setYear(2023);

        // Display the updated date
        System.out.print("Updated date: ");
        date.displayDate();
    }
}
