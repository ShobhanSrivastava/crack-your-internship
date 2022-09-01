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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = head, next = head.next;
        prev.next = null;
        
        while(next.next != null){
            ListNode tempNext = next.next;
            next.next = prev;
            prev = next;
            next = tempNext;
        }
        
        next.next = prev;
        head = next;
        
        return head;
    }
}