package AssignmentLeetCode;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedListReverseNoMethods {
    // Iterative method to reverse the linked list
    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next; // Store next node
            current.next = prev;               // Reverse the link
            prev = current;                    // Move prev to current
            current = nextTemp;                // Move to next node
        }
        return prev; // New head of the reversed list
    }

    // Recursive method to reverse the linked list
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: empty list or single node
        }
        ListNode newHead = reverseListRecursive(head.next); // Reverse the rest of the list
        head.next.next = head; // Make the next node point to the current node
        head.next = null; // Set current node's next to null
        return newHead; // Return new head of the reversed list
    }
}