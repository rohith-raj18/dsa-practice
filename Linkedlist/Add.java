public class Add {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // take dummy Node for further adding nodes of addition
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;
        while(t1 != null || t2!= null){
            int sum = carry;
            // adding node val of t1 to sum
            if(t1 != null){
                sum += t1.val;
            }
            // adding node val of t2 to sum
            if(t2 != null){
                sum += t2.val;
            }
            // checking if sum is greater than 10 for carry
            ListNode newNode = new ListNode(sum %10);
            carry = sum/10;
			
			// adding new node to dummy and taking curr forward
            curr.next = newNode;
            curr = curr.next;
			
			// further travesing of both list until null
            if(t1 != null){
                t1 = t1.next;
            }
            if(t2 != null){
                t2 = t2.next;
            }
        }
        // checking if any carry left over then adding it to dummy list 
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }
        return dummy.next;
    }
}
