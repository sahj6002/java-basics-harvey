import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salary;
        int overtimeValue = 150;
        int overtime;
        int absentValue = 100;
        int absent;
        int insurance = 1500;

        System.out.print("What is your salary? ");
        salary = scanner.nextInt();

        System.out.print("How many is your overtime? ");
        overtime = scanner.nextInt();

        System.out.print("How many is your absences? ");
        absent = scanner.nextInt();

        int totalOvertime = overtimeValue * overtime;
        int totalAbsent = absentValue * absent;
        int netsalary = (salary + totalOvertime) - (insurance + totalAbsent);

        System.out.println("Your Net Salary is: " + netsalary);

        scanner.close();

    }
}