public class App {
    static void main() {
        System.out.println( "welcome to palindrome");
        System.out.println("version1.0");
        System.out.println("system    initiated");
        public class UseCase4PalindromeCheckerApp {

            public static void main(String[] args) {

                // Declare and initialize input
                String input = "radar";

                // Convert string to character array
                char[] chars = input.toCharArray();

                // Initialize pointers
                int start = 0;
                int end = chars.length - 1;

                // Assume palindrome
                boolean isPalindrome = true;

                // Two-pointer comparison
                while (start < end) {
                    if (chars[start] != chars[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                // Display result
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
            }
        }
                    }

}
