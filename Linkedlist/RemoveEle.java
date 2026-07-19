public class RemoveEle {
    public ListNode removeElements(ListNode head, int val) {
    	// took dummy we because to give valid node to point for prev so we can trace easily
    	// along side curr
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
