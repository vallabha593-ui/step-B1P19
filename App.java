import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    static void main() {
        System.out.println("welcome to palindrome");
        System.out.println("version1.0");
        System.out.println("system    initiated");
        import java.util.LinkedList;
import java.util.Scanner;

        public class App {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                LinkedList<Character> list = new LinkedList<>();

                // Add characters to linked list
                for (char c : input.toCharArray()) {
                    list.add(c);
                }

                boolean isPalindrome = true;

                // Compare first and last
                while (list.size() > 1) {
                    char first = list.removeFirst();
                    char last = list.removeLast();

                    if (first != last) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.println("Input: " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);

                sc.close();
            }
        }
    }
}