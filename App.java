public class App {
    static void main() {
        System.out.println( "welcome to palindrome");
        System.out.println("version1.0");
        System.out.println("system    initiated");
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

        public class UseCase6PalindromeCheckerApp {

            public static void main(String[] args) {

                // Define input string
                String input = "civic";

                // Create Queue (FIFO)
                Queue<Character> queue = new LinkedList<>();

                // Create Stack (LIFO)
                Stack<Character> stack = new Stack<>();

                // Insert characters into both queue and stack
                for (char c : input.toCharArray()) {
                    queue.add(c);     // enqueue
                    stack.push(c);    // push
                }

                // Flag to track palindrome status
                boolean isPalindrome = true;

                // Compare queue (front) and stack (top)
                while (!queue.isEmpty()) {
                    char fromQueue = queue.remove();   // dequeue
                    char fromStack = stack.pop();      // pop

                    if (fromQueue != fromStack) {
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
