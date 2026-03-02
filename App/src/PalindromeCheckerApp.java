import java.util.Scanner;

// Service class
class PalindromeChecker {

    // Public method exposed to users
    public boolean checkPalindrome(String input) {

        // preprocessing (optional enhancement)
        String str = input.toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end])
                return false;

            start++;
            end--;
        }
        return true;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (checker.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
