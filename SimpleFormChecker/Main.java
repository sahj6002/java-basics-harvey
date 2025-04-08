import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid;

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String number = scanner.nextLine();
        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        if (isNameValid(name)){
            System.out.println("Name Valid");
            isValid = true;
        }else{
            System.out.println("Name Invalid");
            isValid = false;
        }

        Pattern pattern = Pattern.compile(".*\\@.+\\..+");
        Matcher matcher = pattern.matcher(email);

        if(isEmailValid(email) && matcher.matches()){
            System.out.println("Email Valid");
            isValid = true;
        }else{
            System.out.println("Email Invalid");
            isValid = false;
        }

        if (isNumberValid(number)){
            System.out.println("Number is valid");
            isValid = true;
        }else {
            System.out.println("Number Invalid");
            isValid = false;
        }

        int ageValue = Integer.parseInt(age);
        if (ageValue >= 1 && ageValue <= 120){
            System.out.println("Age valid");
            isValid = true;
        }else{
            throw new IllegalArgumentException("Age must be 1 -120");
        }

        if (isValid = true){
            System.out.println("Registration Successful");
        }else{
            System.out.println("Registration Unsuccessful");
        }

        scanner.close();
    }

    public static boolean isNameValid(String str){
        if (str.length() < 5 || !str.contains(" ") || str.contains(".*[0-9].*")){
            return false;
        }else {
            return true;
        }
    }

    public static boolean isEmailValid(String str){
        if (str.isEmpty() || !str.contains("@") || !str.contains(".")){
            return false;
        }else {
            return true;
        }
    }

    public static boolean isNumberValid(String str){
        if (str.length() == 11 || str.startsWith("09") || str.contains(".*[0-9].*")){
            return true;
        }else {
            return false;
        }
    }
}
