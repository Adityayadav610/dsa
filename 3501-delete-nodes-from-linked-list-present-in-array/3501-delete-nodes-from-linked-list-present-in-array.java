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
    public ListNode modifiedList(int[] nums, ListNode head) {
       HashSet<Integer> valuesToRemove = new HashSet<>();  
        
        
        for (int num : nums) {  
            valuesToRemove.add(num);  
        }  

         
        ListNode dummy = new ListNode(0);  
        dummy.next = head;  
        ListNode curr = dummy;  

         
        while (curr != null && curr.next != null) {  
              
            if (valuesToRemove.contains(curr.next.val)) {  
                curr.next = curr.next.next;   
            } else {  
                 
                curr = curr.next;  
            }  
        }  

         
        return dummy.next;  
    
    }
}