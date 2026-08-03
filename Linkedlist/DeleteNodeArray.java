public class DeleteNodeArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(-1);// take for traversing of prev node;
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = dummy.next;
        // add to set for easy checking
        Set<Integer> set = new HashSet<>();
        for(int i : nums ){
            set.add(i);
        }
        // if it contains skip node and move prev.next and curr
        while(curr != null){
            if(set.contains(curr.val)){
                prev.next = curr.next;
                curr = curr.next;
                // else just make prev to curr position and curr to next pos
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        
        return dummy.next;
    }
}
