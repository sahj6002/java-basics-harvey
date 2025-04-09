import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter score 1: ");
        int score1 = scanner.nextInt();
        System.out.print("Enter score 2: ");
        int score2 = scanner.nextInt();
        System.out.print("Enter score 3: ");
        int score3 = scanner.nextInt();

        System.out.println("==== Grade Report =====");
        System.out.println("Student: " + capitalize(name));
        System.out.println("Average Score: " + average(score1, score2, score3));
        System.out.println("Letter Grade: " + getLetterGrade(average(score1, score2, score3)));
        System.out.println("Status: " + printReport(getLetterGrade(average(score1, score2, score3))));
        System.out.println("======================");

        scanner.close();
    }
    public static String capitalize(String str){
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words){
            if (word.length() > 0){
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }return sb.toString().trim();
    }
    public static double average(int s1, int s2, int s3){
        double result = (s1 + s2 + s3) / 3.0;
        return result;
    }
    public static String getLetterGrade(double score){
        if (score <= 100.0 && score >= 90.0){
            return "A";
        }else if (score < 90.0 && score >= 80.0){
            return "B";
        }else if (score < 80.0 && score >= 70.0){
            return "C";
        }else if (score < 70.0 && score >= 60.0){
            return "D";
        }else if (score <60.0){
            return "F";
        }else{
            return "Invalid Grade";
        }
    }
    public static String printReport(String str){
        if (str.matches(".*[A-D].*")){
            return "Passed";
        }else {
            return "Failed";
        }
    }
}
