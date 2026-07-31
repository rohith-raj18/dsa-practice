public class SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        // firstly find length for knowing position from last
        while(temp != null){
            len++;
            temp = temp.next;
        }
        // for knowing exact node position im taking first and second node 
        ListNode first = null;
        ListNode second = null;
        ListNode temp2 = head;
        for(int i = 1;i<= len;i++){// traversing till last for getting two node position at once
            if(i == k){
                first = temp2;
            }
            if(i == len-k+1){
                second = temp2;
            }
            temp2 = temp2.next;
        }
        // swapping values as asked in question
        int fake = first.val;
        first.val = second.val;
        second.val = fake;
        return head;
    }
}
