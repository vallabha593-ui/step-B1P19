public class App {
    static void main() {
        System.out.println( "welcome to palindrome");
        System.out.println("version1.0");
        System.out.println("system    initiated");
import java.util.Scanner;

        public class UseCase3PalindromeCheckerApp {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to Palindrome Checker");
                System.out.print("Enter a string: ");

                String input = scanner.nextLine();
                String reversed = "";

                // Reverse the string using loop
                for (int i = input.length() - 1; i >= 0; i--) {
                    reversed = reversed + input.charAt(i);
                }

                // Compare original and reversed string
                if (input.equals(reversed)) {
                    System.out.println("It is a Palindrome.");
                } else {
                    System.out.println("It is NOT a Palindrome.");
                }

                scanner.close();
            }
        }

                    }

}
