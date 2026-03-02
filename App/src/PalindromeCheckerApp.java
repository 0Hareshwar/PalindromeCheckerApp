import java.util.Scanner;

// Case-insensitive & space-ignored checker
class CaseSpaceChecker {

    // Public method
    public boolean checkPalindrome(String input) {

        // Normalize string
        String str = input.toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = str.length() - 1;

        // Palindrome check
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}

// MAIN CLASS (required format)
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CaseSpaceChecker checker = new CaseSpaceChecker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (checker.checkPalindrome(input))
            System.out.println("Palindrome (Ignoring case & spaces)");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}