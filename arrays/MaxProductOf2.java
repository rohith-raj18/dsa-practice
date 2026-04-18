import java.util.*;
public class MaxProductOf2{
	public static int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;
        while(n > 0){
            int temp = n%10;
            if(temp > max1){
                max2 = max1;
                max1 = temp;
            }else if(temp > max2){
                max2 = temp;
            }
           
            n /= 10;
        }
        return max1*max2;
    }
    public static void main(String[] args){
    	System.out.println(maxProduct(267));
    }
}
