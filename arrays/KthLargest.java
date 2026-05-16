import java.util.*;
public class KthLargest{
	public static int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i:nums){
        pq.add(i);
       }
       for(int i = 1;i<k;i++){
        pq.poll();
       }
       return pq.peek();
    }
    public static void main(String[] args){
    	int[] arr = {2,6,3,9,1,4};
    	System.out.println(findKthLargest(arr,2));
    }
}
