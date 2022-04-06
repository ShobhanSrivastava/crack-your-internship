return first;
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
public int findLength(ListNode first, ListNode second){
int count = 0;
while(first != second){
first = first.next;
count++;
}
return count;
}
}