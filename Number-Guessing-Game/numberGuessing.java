import java.util.Scanner;
import java.util.Random;

public class numberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number;
        int randomNumber = random.nextInt(100) + 1;
        int guessCount = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            System.out.print("Enter your number(1-100): ");
            number = scanner.nextInt();
            guessCount++;

            if (number < 0 || number > 100) {
                System.out.println("Invalid Number! Please choose from 1-100.");
            }else if (number == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + "🎉");
                System.out.println("It took you " + guessCount + " guesses!");
            }else if (number > randomNumber) {
                System.out.println("Lower!" );
            }else if (number < randomNumber) {
                System.out.println("Higher!");
            }

        }while (number != randomNumber);
    }
}