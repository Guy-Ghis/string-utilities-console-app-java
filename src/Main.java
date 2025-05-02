import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the String Utilities Console App");

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("===================================");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Compress String");
            System.out.println("3. Reverse Sentence Words");
            System.out.println("4. Remove Vowels");
            System.out.println("5. Validate Password");
            System.out.println("Type 'exit' to quit");
            System.out.print("Your choice: ");

            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            switch (input) {
                case "1":
                    System.out.print("Enter string: ");
                    String string1 = scanner.nextLine();
                    StringUtilities.isPalindrome(string1);
                    if (StringUtilities.isPalindrome(string1)) {
                        System.out.println("\nThe string is a palindrome.");
                    } else {
                        System.out.println("\nThe string is not a palindrome.");
                    }
                    break;
                case "2":
                    System.out.print("Enter string: ");
                    String string2 = scanner.nextLine();
                    System.out.println("\nCompressed string: " + StringUtilities.compress(string2));
                    break;
                case "3":
                    System.out.print("Enter sentence: ");
                    String sentence = scanner.nextLine();
                    System.out.println("\nReversed sentence: " + StringUtilities.reverseWords(sentence));
                    break;
                case "4":
                    System.out.print("Enter string: ");
                    String string3 = scanner.nextLine();
                    System.out.println("\nString without vowels: " + StringUtilities.removeVowels(string3));
                    break;
                case "5":
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    if(StringUtilities.isStrongPassword(password)) {
                        System.out.println("\nPassword is valid.");
                    } else {
                        System.out.println("\nPassword is invalid.");
                    }
                    break;
                default:
                    System.out.println("\nInvalid option. Try again.");
            }
        }

        scanner.close();
    }
}
