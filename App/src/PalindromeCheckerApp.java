import java.util.Scanner;

// Recursive palindrome checker class
class RecursiveChecker {

    // Public method
    public boolean checkPalindrome(String input) {
        String str = input.toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        return isPalindrome(str, 0, str.length() - 1);
    }

    // Recursive function
    private boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // Character comparison
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}

// MAIN CLASS (required format)
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RecursiveChecker checker = new RecursiveChecker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (checker.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}