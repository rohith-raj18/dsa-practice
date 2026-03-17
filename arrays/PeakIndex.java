import java.util.*;
public class PeakIndex{
	public static int peakIndex(int[] nums){
		int i = 0;
		int j = nums.length-1;
		while(i<j){
			int mid = i + (j-i)/2;
			if(nums[mid] < nums[mid + 1]){
				i = mid + 1;
			}
			if(nums[mid] > nums[mid + 1]){
				j = mid;
			}
		}
		return j;
	}
	public static void main(String[] args){
		int[] arr = {0,1,3,6,2,1};
		System.out.println(peakIndex(arr));
	}
}
