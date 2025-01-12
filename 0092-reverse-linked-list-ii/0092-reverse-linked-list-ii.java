/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {  
    public ListNode reverseBetween(ListNode head, int left, int right) {  
        // Edge case: If the list is empty or left == right (no action needed)  
        if (head == null || left == right) {  
            return head;  
        }  

        // Create a dummy node to handle edge cases easily  
        ListNode dummy = new ListNode(0);  
        dummy.next = head;  
        ListNode prev = dummy;  

        // Move prev to the node just before the left position  
        for (int i = 0; i < left - 1; i++) {  
            prev = prev.next;  
        }  

        // Start reversing the sublist  
        ListNode curr = prev.next; // The first node to be reversed  
        ListNode next = null;  

        // Reverse the nodes from left to right  
        for (int i = 0; i < right - left; i++) {  
            next = curr.next; // Store the node next to curr  
            curr.next = next.next; // Remove next from the list  
            next.next = prev.next; // Insert next at the beginning of the reversed section  
            prev.next = next; // Connect prev to next  
        }  

        // Return the modified list, starting from the real head  
        return dummy.next;  
    }  
}