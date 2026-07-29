public class ReverseListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null){
            return head;
        }
        int pos = 1;
        ListNode temp = head;
        ListNode prev = null;
        ListNode next = null;
        ListNode before = null;
        ListNode after = null;
        while(temp != null){
           // take a pointer before left pos
            if(pos == left-1){
                before = temp;
            }
            // using pos var go till left and right positions
            if(pos == left){
                prev = temp;
            }
            if(pos == right){
                next = temp;
            }
            temp = temp.next;
            pos++;
        }
        // take other pointer after right pos for relinking purpose
        after = next.next;
        // after saving next pointer after right pos break the list after right node or pos
        next.next = null;
        // take rhead for return of revrerseList function
        ListNode rhead = reverseList(prev);
        
        // before is not null means we can join after before or if null then directly keep head equals to rhead
        if(before != null){
            before.next = rhead;
        }else{
            head = rhead;
        }
        prev.next = after;
        return head;
    }
    // this reverse list function
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
