import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int employees = scanner.nextInt();
        System.out.println("Enter the number of days worked: ");
        int days = scanner.nextInt();

        int[][] hoursWorked = new int[employees][days];
        String[] employeeNames = new String[employees];
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < employees; i++) {
            System.out.println("Enter the name of employee " + (i + 1) + ": ");
            employeeNames[i] = scanner.nextLine();
        }

        for (int i = 0; i < employees; i++) {
            System.out.println("Enter the hours worked by " + employeeNames[i] + ": ");
            for (int j = 0; j < days; j++) {
                System.out.println("Hours worked on day " + (j + 1) + ": ");
                hoursWorked[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Work hours for each employee by day: ");
        for (int i = 0; i < employees; i++) {
            System.out.print(employeeNames[i] + "\t");
            for (int j = 0; j < days; j++) {
                System.out.print(hoursWorked[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
