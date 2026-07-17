class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        // firstly find the length to track where will the n from front
        while(temp != null){
            length++;
            temp = temp.next;
        }
        // you can track from k which position should be deleted
        int k = length-n;
        if(head == null){
            return null;
        }
        if(length == 1 && n == 1){
            return null;
        }
        if(k == 0){
            return head.next;
        }
        ListNode prev = head;
        // take your prev node till the before position of k and delete it
        for(int i = 1;i<k;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        
        return head;
    }
}
