import java.util.*;
public class MajorityElement{
	public static int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 0;
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])> arr.length/2){
                k = arr[i];
            }
        
        }
        return k;
    }
	public static void main(String[] args){
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}
}
