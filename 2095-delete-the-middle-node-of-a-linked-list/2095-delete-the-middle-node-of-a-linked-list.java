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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return head.next;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            count++;
        }
        
        while(count > 1){
            slow = slow.next;
            count--;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
}