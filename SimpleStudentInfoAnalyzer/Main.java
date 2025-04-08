import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //interface
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter subjects (comma-separated): ");
        String subjects = scanner.nextLine();


        //capitalize
        String capitalizeName = capitalize(name);
        System.out.println("Capitalize Name: " + capitalizeName);
        String initials = getInitials(name);
        System.out.println("Initials: " + initials);

        if(isValidId(id)){
            System.out.println("Student's Valid ID: " + isValidId(id));
        }else{
            System.out.println("Invalid ID");
        }

        System.out.println("Number of Subject: " + countWords(subjects));
        String capitalizeSubjects = capitalizeWords(subjects);
        System.out.println("Subjects in Uppercase " + capitalizeSubjects);

        String generatedID = combine(name, id);
        System.out.println("Generated Student Code: " + generatedID);


        scanner.close();
    }

    public static String capitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }return sb.toString().trim();
    }

    public static String getInitials(String str){
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words){
            if (word.length() > 0){
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(".");
            }
        }return sb.toString();
    }

    public static boolean isValidId(String id){
        if (id.length() < 4){
            return false;
        }
        return id.startsWith("2025");
    }

    public static int countWords(String str){
        if (str == null || str.isEmpty()){
            return 0;
        }
        String[] words = str.split(",");
        return words.length;
    }

    public static String capitalizeWords(String str){
        String[] words = str.split(",");
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            if (word.length() > 0){
                sb.append(word.toUpperCase())
                        .append(",");
            }
        }return sb.toString();
    }

    public static String combine(String name, String id){
        if(name.length() < 3 || id.length() < 3){
            throw new IllegalArgumentException("Both name and ID must be at least 3 characters long.");
        }
        String firsThreeLettersOfName = name.substring(0,3);
        String lastThreeLetterOfId = id.substring(id.length() - 3);

        return firsThreeLettersOfName.toUpperCase() + lastThreeLetterOfId;
    }
}
