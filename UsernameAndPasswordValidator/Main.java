import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isUsernameValid(username) && !username.contains(" ")){
            System.out.println("Username valid");
        } else {
            System.out.println("Username invalid");
        }

        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasLowerCase = password.matches(".*[a-z].*");
        boolean hasNumber = password.matches(".*[1-9].*");

        if (hasNumber && hasUpperCase && hasLowerCase){
            System.out.println("Password Valid");
        } else {
            System.out.println("Password Invalid");
        }


        scanner.close();
    }
    public static boolean isUsernameValid(String str){
        if (str == null || str.length() < 5){
            return false;
        }
        return true;
    }
}
