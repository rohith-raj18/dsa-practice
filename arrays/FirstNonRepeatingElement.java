import java.util.*;
public class FirstNonRepeatingElement{
	public static int first(int[] arr){
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        int k = 0;
        for(int each : arr){
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }
        for(int i : arr){
            if(map.get(i) == 1){
                k = i;
                break;
            }
            else{
                k = -1;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2, 3, 4, 4};
        System.out.println(first(arr));
    }
}
