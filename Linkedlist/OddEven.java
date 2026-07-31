public class OddEven{
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode even = head.next;
        ListNode ehead = even;// save evenhead for relinking
        ListNode odd = head;
        // why only checking even is even will end first so odd safety is done 
        while(even != null && even.next != null){
        // just join even to even and move even forward and odd to odd and move odd forwar
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        // relink odd.next = evenhead
        odd.next = ehead;
        return head;
    }
}
