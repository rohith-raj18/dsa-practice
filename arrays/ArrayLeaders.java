import java.util.*;

public class ArrayLeaders {
    public static List<Integer> arrayLeader(int[] arr){
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = arr.length-1;i>=0;i--){
           if(arr[i] > max){
               max = arr[i];
               list.add(max);
           }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args){
        int[] arr = {8,18,12,0,6};
        System.out.println(arrayLeader(arr));
     }
}
