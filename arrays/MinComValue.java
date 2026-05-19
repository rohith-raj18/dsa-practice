import java.util.*;
public class MinComValue{
	public static int getCommon(int[] nums1, int[] nums2) {

    	int i = 0;
    	int j = 0;

    	while (i < nums1.length && j < nums2.length) {
        	if (nums1[i] == nums2[j]) {
           		return nums1[i];
        	}
        	else if (nums1[i] < nums2[j]) {
            	i++;
        	}
        	else {
            	j++;
        	}
    	}
    	return -1;
	}
	public static void main(String[] args){
		int[] arr = {1,2,3};
		int[] nums = {2,3};
		System.out.println(getCommon(arr,nums));
	}
}
