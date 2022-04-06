public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode commonNode = findNodeInCycle(head);
        
        if(commonNode == null){
            return null;
        }
        
        // int length = findLength(commonNode, commonNode);
        
//         ListNode first = head, second = head;
        
//         for(int i=1 ; i<=length ; i++){
//             first = first.next;
//         }
        
//         while(first != second){
//             first = first.next;
//             second = second.next;
//         }
        
//         return first;
        
        while(commonNode != head){
            commonNode = commonNode.next;
            head = head.next;
        }
        
        return head;
    }
    
    public ListNode findNodeInCycle(ListNode head){
        ListNode slow = head, fast = head;
        
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return slow;
            }
        }
        
        return null;
    }
    
//     public int findLength(ListNode first, ListNode second){
//         int count = 0;
//         while(first != second){
//             first = first.next;
//             count++;
//         }
        
//         return count;
//     }
}