public class App {
    static void main() {
        System.out.println( "welcome to palindrome");
        System.out.println("version1.0");
        System.out.println("system    initiated");
import java.util.ArrayDeque;
import java.util.Deque;

        public class UseCase7PalindromeCheckerApp {

            public static void main(String[] args) {

                // Define the input string
                String input = "refer";

                // Create a Deque to store characters
                Deque<Character> deque = new ArrayDeque<>();

                // Add each character to the deque
                for (char c : input.toCharArray()) {
                    deque.addLast(c);
                }

                // Flag to track palindrome result
                boolean isPalindrome = true;

                // Continue comparison while more than one element exists
                while (deque.size() > 1) {
                    char first = deque.removeFirst();
                    char last = deque.removeLast();

                    if (first != last) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Output result
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
            }
        }
                    }

}
