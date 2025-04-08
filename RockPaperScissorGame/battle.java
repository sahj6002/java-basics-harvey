import java.util.Random;
import java.util.Scanner;

public class battle {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number;
        String name;
        String turn;
        String rock = "Rock";
        String paper = "Paper";
        String scissor = "Scissor";

        number = random.nextInt(1,4);

        //player
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Hello " + name + "! Please Choose Rock, Paper or Scissor?: ");
        turn = scanner.nextLine();

        if (turn.equals("Rock")) {
            System.out.println("You have chosen " + rock);
        }
        else if (turn.equals("Paper")) {
            System.out.println("You have chosen " + paper);
        }
        else if (turn.equals("Scissor")) {
            System.out.println("You have chosen " + scissor);
        }

        //waiting screen
        System.out.println("Please wait,");
        System.out.println("Guts is choosing");

        for (int x = 3; x >= 1; x--) {
            System.out.println(x);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //guts
        if (number == 1) {
            System.out.println("Guts chose Rock!");
        }
        else if (number == 2) {
            System.out.println("Guts has chose Paper!");
        }
        else {
            System.out.println("Guts has chose Scissors!");
        }
        try{
            Thread.sleep(2300);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        //battle
        if (turn.equals("Rock") && (number == 1)) {
            System.out.println("It's a draw");
        }
        else if (turn.equals("Rock") && (number == 2)) {
            System.out.println("Guts Won");
        }
        else if (turn.equals("Rock") && (number == 3)) {
            System.out.println(name + " Won");
        }
        else if (turn.equals("Paper") && (number == 1)) {
            System.out.println(name + " Won");
        }
        else if (turn.equals("Paper") && (number == 2)) {
            System.out.println("It's a draw");
        }
        else if (turn.equals("Paper") && (number == 3)) {
            System.out.println("Guts Won");
        }
        else if (turn.equals("Scissor") && (number == 1)) {
            System.out.println("Guts Won");
        }
        else if (turn.equals("Scissor") && (number == 2)) {
            System.out.println(name + " Won");
        }
        else if (turn.equals("Scissor") && (number == 3)) {
            System.out.println("It's a draw");
        }
        else {
            System.out.println("Invalid Battle");
        }

        scanner.close();
    }
}
