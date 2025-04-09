import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        double math, english, science, average = 0;

        System.out.print("Enter the student's name: ");
        name = scanner.nextLine();

        System.out.print("Enter your Math Grade: ");
        math = scanner.nextDouble();
        System.out.print("Enter your English Grade: ");
        english = scanner.nextDouble();
        System.out.print("Enter your Science Grade: ");
        science = scanner.nextDouble();

        average = (math + english + science) / 3.0;
        System.out.printf(name + "'s grade is %.2f\n", average);

        if (average >= 60) {
            if(average >= 91) {
                System.out.println("Equivalent Grade = A");
            }else if(average >= 86) {
                System.out.println("Equivalent Grade = B");
            }else if(average >= 81) {
                System.out.println("Equivalent Grade = C");
            }else if(average >= 76) {
                System.out.println("Equivalent Grade = D");
            }else if(average < 76) {
                System.out.println("Equivalent Grade = E");
            }
            }else{
            System.out.println("Failed");
        }

    }
}
