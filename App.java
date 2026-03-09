import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    static void main() {
        System.out.println("welcome to palindrome");
        System.out.println("version1.0");
        System.out.println("system    initiated");


        interface PalindromeStrategy {
            boolean checkPalindrome(String input);
        }

        class StackStrategy implements PalindromeStrategy {

            public boolean checkPalindrome(String input) {

                String normalized = input.replaceAll("\\s+", "").toLowerCase();



                for (char c : normalized.toCharArray()) {

                }

                String reversed = "";



                return normalized.equals(reversed);
            }
        }

        class DequeStrategy implements PalindromeStrategy {

            public boolean checkPalindrome(String input) {

                String normalized = input.replaceAll("\\s+", "").toLowerCase();

                Deque<Character> deque = new ArrayDeque<>();

                for (char c : normalized.toCharArray()) {
                    deque.addLast(c);
                }

                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
                        return false;
                    }
                }

                return true;
            }
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        System.out.println("Choose strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.checkPalindrome(input);

        System.out.println("Is Palindrome?: " + result);

        scanner.close();
    }
}

