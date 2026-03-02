import java.util.Scanner;

class FlexiblePalindrome {

    // Palindrome check function
    static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Normalize string
        String normalized = input
                .toLowerCase()
                .replaceAll("[^a-z0-9]", ""); // remove spaces & symbols

        // Step 2: Check palindrome
        if (isPalindrome(normalized))
            System.out.println("Palindrome (Ignoring spaces & case)");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}