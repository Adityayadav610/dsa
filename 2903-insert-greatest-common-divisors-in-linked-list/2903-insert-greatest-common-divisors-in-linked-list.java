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

    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a<0 ? -a:a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
           int gcdValue= gcd(curr.val,curr.next.val);
           ListNode newNode=new ListNode(gcdValue);
           newNode.next=curr.next;
           curr.next=newNode;
           curr=newNode.next;
        }
        return head;
        
    }
}