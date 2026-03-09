import java.util.*;
public class MinCapacityBox{
	public static int minimumIndex(int[] capacity, int itemSize) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0;i<capacity.length;i++){
           if(capacity[i] >= itemSize && capacity[i] < min){
               min = capacity[i];
               index = i;
           }
        }
        return index;
    }
    public static void main(String[] args){
    	int[] arr = {1,5,3,7};
    	System.out.println(minimumIndex(arr,3));
    }
}
