import java.util.*;
public class SeparateDigits{
	public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i: nums){
            String s = String.valueOf(i);
			// why string because normal digit separation will come in reverse order so
            for(char ch:s.toCharArray()){
                list.add(ch - '0');
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
	public static void main(String[] args){
		int[] arr = {13,25,83,77};
		System.out.println(Arrays.toString(separateDigits(arr)));
	}
}
