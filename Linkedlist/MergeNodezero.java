public class MergeNodezero{
	public ListNode mergeNode(ListNode head){
		ListNode start = head.next;// for storing nodes after addition
		ListNode temp = start;// for traversing
		ListNode nhead = start;// we know first is zero so new head will be at start
		int sum;
		// iteration loop until start becomes null
		while(start != null){
			sum = 0;
			// until temp is zero or segment ends/ a part ends take sum of nodes
			while(temp.val != 0){
				sum += temp.val;
				temp = temp.next;	
			}
			start.val = sum;// give it to start
			
			// check whether is there any node left or finished
			if(temp.next != null){
				start.next = temp.next;
			}else{
				start.next = null;
			}
			// continue travesing and point start to temp as start is linked to temp.next previously above
			temp = temp.next;
			start = temp;
		}
		return nhead;
	}
}
