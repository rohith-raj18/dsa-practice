import java.util.*;
public class ContainerWithMostWater{
    public static int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int max_area = 0;
        while(i<j){
            int area = Math.min(arr[i],arr[j]) * (j-i);
            if(area > max_area){
                max_area = area;
            }

            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return max_area;
    }
	public static void main(String[] args){
		int[] arr = {1,8,2,3,5,3,7,3};
		System.out.println(maxArea(arr));
	}
}
