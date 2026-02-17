import java.util.*;
public class SumOfUnique{
	public static int sumOfUnique(int[] arr) {
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int each: map.keySet()){
            if(map.get(each) == 1){
                sum += each;
            }
        }
        return sum;
    }
	public static void main(String[] args){
		int[] arr = {1,2,3,4,2};
		System.out.println(sumOfUnique(arr));
	}
}
