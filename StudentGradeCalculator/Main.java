import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String math, science, english, history, pe;

        //interface
        System.out.print("Enter your grade(Math): ");
        math = scanner.nextLine();
        System.out.print("Enter your grade(Science): ");
        science = scanner.nextLine();
        System.out.print("Enter your grade(English): ");
        english = scanner.nextLine();
        System.out.print("Enter your grade(History): ");
        history = scanner.nextLine();
        System.out.print("Enter your grade(P.E): ");
        pe = scanner.nextLine();

        //conversion
        int mathGrade = Integer.parseInt(math);
        int scienceGrade = Integer.parseInt(science);
        int englishGrade = Integer.parseInt(english);
        int historyGrade = Integer.parseInt(history);
        int peGrade = Integer.parseInt(pe);

        //calculations
        double result = ((mathGrade + scienceGrade + englishGrade + historyGrade + peGrade) / 5.0);

        //grade conversion
        if (result <= 100.0 && result >= 90.0) {
            System.out.println("Your average is " + result);
            System.out.println("You get an A!");
        }else if (result <= 89.99 && result >= 80.00){
            System.out.println("Your average is " + result);
            System.out.println("You get a B!");
        }else if (result <= 79.99 && result >= 70.00) {
            System.out.println("Your average is " + result);
            System.out.println("You get a C!");
        }else if (result <= 69.99 && result >= 60.00){
            System.out.println("Your average is " + result);
            System.out.println("You get a D!");
        }else if (result < 60) {
            System.out.println("You failed!");
        }else {
            System.out.println("Invalid grade");
        }

        scanner.close();
    }
}
