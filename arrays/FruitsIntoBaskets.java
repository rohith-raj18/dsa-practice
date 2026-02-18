import java.util.*;
public class FruitsIntoBaskets{
	public static int totalFruit(int[] arr) {
        int max = 0;
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
    
        while(j<arr.length){

            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            while(map.size() > 2){
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i]) == 0){
                    map.remove(arr[i]);
                }
                i++;
            }
            max = Math.max(max,(j-i)+1);
            j++;
        }
        return max;
    }
	public static void main(String[] args){
		int[] arr = {1,2,3,2,2};
		System.out.println(totalFruit(arr));
	}
}
