public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0){
            return head;
        }
        ListNode len = head;
        int length = 0;
        // find length of whole list to know where to cut
        while(len!=null){
            length++;
            len = len.next;
        }
        // for reducing rotations
        k = k % length;

        if (k == 0){
            return head;
        }

        ListNode prev = head;
        // take prev pointer to where to need to cut
        for(int i = 1;i<length-k;i++){
            prev = prev.next;
        }
        // then make prev.next to null
        ListNode curr = null;
        curr = prev.next;
        prev.next = null;
        ListNode temp = curr;
        // join the remaining part of linked list 
        while(curr.next != null){
            curr = curr.next;
        }
        // bring head at the front
        curr.next = head;
        head = temp;

        return head;
    }
}
