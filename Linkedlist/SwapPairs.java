public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1); // for prev pointer bcoz of head might not be the same in this problem
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode next = head.next;
        // swapping thing
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            curr.next = next.next;
            next.next = curr;

            prev = curr;
            curr =curr.next;
            // move next only when there exist a curr which is not null
            if(curr != null){
                next = curr.next;
            }
        }
        return dummy.next;
    }
}
