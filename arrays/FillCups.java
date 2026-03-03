import java.util.*;
public class FillCups{
	 public static int fillCups(int[] amount) {
       
        int sum = amount[0] + amount[1]+amount[2];
        int max = Math.max(amount[0],Math.max(amount[1],amount[2]));
        return Math.max(max,(sum+1)/2);
    }
	public static void main(String[] args){
		int [] arr = {1,4,2};
		System.out.println(fillCups(arr));
	}
}
