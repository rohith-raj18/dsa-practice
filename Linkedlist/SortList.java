public class SortList {
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode right = split(head);
        ListNode left =  head;
        // split till it gets single node
        left = sortList(left);
        // same here till gets single node
        right = sortList(right);
        
        return mergeTwoLists(left,right);
        
    }
    public ListNode split(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        // finding middle and splitting two list 
        while(fast!=null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        // returning slow bcoz it points to first node of the second part of list and
		// why not head bcoz we already have head in the first sortList part so not 		necessary
        return slow;
    }
    public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;
        // merge part
        while(list1!= null && list2!= null){
            if(list1.val <= list2.val){
                dummy.next = list1;
                list1 = list1.next;
            }else{
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }
        while(list1!=null){
            dummy.next = list1;
            list1= list1.next;
            dummy = dummy.next;
        }
        while(list2!=null){
            dummy.next = list2;
            list2 = list2.next;
            dummy = dummy.next;
        }
        temp = temp.next;
        return temp;
    }
}
