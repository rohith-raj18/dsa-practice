public class RemoveDuplicateII {
    public ListNode deleteDuplicates(ListNode head) {
    // for keeping track of prev node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
        // start checking from first node itself
            if(curr.next != null && curr.val == curr.next.val){
            // skip duplicates till the last duplicate element
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                // direclty skip all and join to the last node
                prev.next = curr.next;
                curr = curr.next;
            }else{
            // if unique element take prev to curr node and continue tracing with curr moving
                prev = curr;
                curr = curr.next;
            }
        }
        // for starting from head
        return dummy.next;
    }
}
