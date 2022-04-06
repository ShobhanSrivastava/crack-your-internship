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
        HashMap<ListNode, Integer> map = new HashMap<>();
        
        while(head != null){
            if(map.get(head) == null){
                map.put(head, 1);
            }
            else{
                return head;
            }
            head = head.next;
        }
        
        return null;
    }
}