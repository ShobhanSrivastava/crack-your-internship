/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean cycle = false;
        
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        
        if(!cycle){
            return null;
        }
        
        while(slow!=head){
            slow = slow.next;
            head = head.next;
        }
        
        return head;
    }
}