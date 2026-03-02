import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String original = "madam";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}