/* #Leet Code 206

##206. Reverse Linked List

**Difficulty:**Easy

###Topics-Linked List-Recursion-Iteration

###Companies-[List of companies that ask this question]

###Problem Statement Given the head of a singly linked list,reverse the list,and return the reversed list.

###Examples

####Example 1:**Input:**`head=[1,2,3,4,5]`**Output:**`[5,4,3,2,1]`

####Example 2:**Input:**`head=[1,2]`**Output:**`[2,1]`

####Example 3:**Input:**`head=[]`**Output:**`[]`

###Constraints:-The number of nodes in the list is in the range`[0,5000]`.-`-5000<=Node.val<=5000`

###Follow Up:A linked list can be reversed either iteratively or recursively.Could you implement both? 

Iterative Method: Uses a loop to reverse the links between nodes.

Recursive Method: Recursively reverses the list and adjusts the links accordingly.

*/

public class LinkedListReverse {
    // Anonymous inner class for ListNode
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

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



