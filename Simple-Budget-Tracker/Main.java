import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many expenses would you like to record? ");
        int input = scanner.nextInt();
        scanner.nextLine();

        String[] expenseName = new String[input];
        double[] amount = new double[input];

        for(int i = 0;i < input;i++){
            System.out.print("Name of expense" + (i + 1) +": ");
            String name = scanner.nextLine();
            expenseName[i] = name;
            System.out.print(name + "'s amount: ");
            int initialAmount = scanner.nextInt();
            scanner.nextLine();
            amount[i] = initialAmount;
        }

        System.out.println("\n --- Expense List ---");
        for(int i = 0;i < input;i++){
            System.out.println(capitalize(expenseName[i]) + " - ₱" + amount[i]);
        }

        double totalExpense = 0;
        for (int i = 0;i < input;i++){
            totalExpense += amount[i];
        }
        System.out.println("Total Expense: ₱" + totalExpense);
        double maximum = Arrays.stream(amount).max().getAsDouble();
        double minimum = Arrays.stream(amount).min().getAsDouble();
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0;i <amount.length;i++){
            if (amount[i] == maximum){
                maxIndex = i;
            }
            if (amount[i] == minimum){
                minIndex = i;
            }
        }

        System.out.println("Highest Expense: " + capitalize(expenseName[maxIndex]) + " - ₱" + maximum);
        System.out.println("Lowest Expense: " + capitalize(expenseName[minIndex]) + " - ₱" + minimum);

        scanner.close();
    }
    public static String capitalize(String str){
        StringBuilder sb = new StringBuilder();

        if(!str.isEmpty()){
            sb.append(Character.toUpperCase(str.charAt(0)))
                    .append(str.substring(1));
        }return sb.toString();
    }
}
