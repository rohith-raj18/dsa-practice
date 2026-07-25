public class DeleteNode {
    public void deleteNode(ListNode node) {
    // like we dont have head access here 
    // you directly have node which has to delete to replace its value to next node and then
    // now direclty connect the change 
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
