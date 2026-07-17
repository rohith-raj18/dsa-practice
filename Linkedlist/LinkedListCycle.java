public class LinkedListCycle{
	public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null){
            return false;
        }
        // fast pointer and slow pointer to check there is a cycle or not 
        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
