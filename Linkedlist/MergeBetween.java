public class MergeBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode left = null;// left is not necessary just for understanding
        ListNode right = null;
        ListNode before = null;
        ListNode after = null;
        ListNode temp = list1; 
        int count = 0;
        // take count for landing on correct node position of a and b
        while(temp != null){

            if(count == a-1){
                before = temp;// before is a node before 'a' position
            }
            if(count == a){
                left = temp;
            }
            if(count == b){
                right = temp;
            }
            temp = temp.next;
            count++;
        }
        after = right.next;// after node of 'b' position
        if(before != null){
        // check if before is the first node or not 
            before.next = list2;
        }else{
            list1=list2;
        }
        // traverse till end and link the last element which is after
        ListNode curr = list2;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = after;
        return list1;
    }
}
