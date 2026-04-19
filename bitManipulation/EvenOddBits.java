import java.util.*;
public class EvenOddBits{
	public static int[] evenOddBit(int n) {
        int odd = 0;
        int even = 0;
        int index = 0;
        while(n > 0){
            if((n&1) == 1){
                if(index%2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
            n = n>>1;
            index++;
        }
        return new int[]{even,odd};
    }
	public static void main(String[] args){
		System.out.println(Arrays.toString(evenOddBit(50)));
	}
}
