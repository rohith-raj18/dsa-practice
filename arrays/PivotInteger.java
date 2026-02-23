import java.util.*;
public class PivotInteger{
	public static int pivotInteger(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        int left = 0;
        for(int i = 1;i<=n;i++){
            int right = sum - left - i;
            if(left == right){
                return i;
            }
            left += i;
        }
        return -1;
    }
	public static void main(String[] args){
		int n = 8;
		System.out.println(pivotInteger(n));
	}
}
