public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode len1 = headA;
        int length1 = 0;
        // find length of first list
        while(len1 != null){
            length1++;
            len1 = len1.next;
        }
        ListNode len2 = headB;
        int length2 = 0;
        // find length of second list
        while(len2 != null){
            length2++;
            len2 = len2.next;
        }
        int k = 0;
        // then compare the lengths of two list and move pointers according to make sure where they meet
        if(length1 > length2){
            k = length1 - length2;
            for(int i = 1;i<=k;i++){
                temp1 = temp1.next;
            }
        }else{
            k = length2 - length1;
            for(int i = 1;i<=k;i++){
                temp2 = temp2.next;
            }
        }
        // now compare and return the pointer 
        while(temp1!=null && temp2!=null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        
        return null;
    }
}
