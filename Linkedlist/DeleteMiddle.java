public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        // using that slow will be on middle element and prev will be on before
        while(fast!=null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        // skip middle and join the link to next element;
        prev.next = slow.next;
        return head;
    }
}
