import java.util.Scanner;

class PalindromeLinkedList {
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    void insert(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    boolean isPalindrome() {

        if (head == null || head.next == null)
            return true;
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow.next);

        // Compare halves
        Node firstHalf = head;
        Node tempSecond = secondHalf;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data)
                return false;

            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeLinkedList list = new PalindromeLinkedList();
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        for (char c : input.toCharArray()) {
            list.insert(c);
        }
        if (list.isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}