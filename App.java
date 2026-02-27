public class App {
    static void main() {
        System.out.println( "welcome to palindrome");
        System.out.println("version1.0");
        System.out.println("system    initiated");
import java.util.Stack;

        public class UseCase5PalindromeCheckerApp {

            public static void main(String[] args) {

                // Declare and initialize input
                String input = "noon";

                // Create stack
                Stack<Character> stack = new Stack<>();

                // Push characters into stack
                for (char c : input.toCharArray()) {
                    stack.push(c);
                }

                // Assume palindrome
                boolean isPalindrome = true;

                // Compare by popping from stack
                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display result
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
            }
        }
                    }

}
