public class BinaryLLToInt{
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int length = 0;
        // firstly find length
        while(temp!= null){
            temp = temp.next;
            length++;
        }
        // then traverse taking length 
        ListNode curr = head;
        int sum = 0;
        for(int i = length-1;i>=0;i--){
            if(curr.val == 1){
                sum += Math.pow(2,i);
            }
            curr = curr.next;
        }
        return sum;
    }
}
