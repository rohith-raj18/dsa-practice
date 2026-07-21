public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // firstly find middle node 
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // then reverse the next node from middle to last 
        ListNode temp = slow;
        ListNode prev = null;
        ListNode next = null;
        while(temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        slow = prev;
        // now compare from both head and middle node which is slow 
        while(slow != null){
            if(head.val != slow.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
