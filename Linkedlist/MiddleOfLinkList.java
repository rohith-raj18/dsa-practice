public class MiddelOfLinkList{
	public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
		// using fast and slow pointer we can assure where middle is 
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
