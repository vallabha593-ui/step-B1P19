import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    static void main() {
        System.out.println("welcome to palindrome");
        System.out.println("version1.0");
        System.out.println("system    initiated");

        class UseCase13PalindromeCheckerApp {

            public static boolean reverseMethod(String input) {
                String s = input.replaceAll("\\s+", "").toLowerCase();

                String reversed = new StringBuilder(s).reverse().toString();

                return s.equals(reversed);
            }

            public static boolean twoPointerMethod(String input) {
                String s = input.replaceAll("\\s+", "").toLowerCase();

                int left = 0;
                int right = s.length() - 1;

                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        return false;
                    }
                    left++;
                    right--;
                }

                return true;
            }

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter text: ");
                String input = scanner.nextLine();

                long start1 = System.nanoTime();
                boolean r1 = reverseMethod(input);
                long end1 = System.nanoTime();

                long start2 = System.nanoTime();
                boolean r2 = twoPointerMethod(input);
                long end2 = System.nanoTime();

                System.out.println("Reverse Method Result: " + r1);
                System.out.println("Execution Time: " + (end1 - start1) + " ns");

                System.out.println("Two Pointer Result: " + r2);
                System.out.println("Execution Time: " + (end2 - start2) + " ns");

                scanner.close();
            }
        }
    }
}
