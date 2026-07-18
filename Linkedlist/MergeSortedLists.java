public class MergeSortedLists{
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;
        // same as merging two arrays but in form of linkedlist version
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
