class LinkedListCycleII{
	public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
            // here just take entry node for checking where exactly the starting point they met and return 
                ListNode entry = head;
                while(slow != entry){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
            
        }
        return null;
    }
}
