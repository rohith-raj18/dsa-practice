import java.util.*;
public class ShortestDistanceToTarget{
	public static int closestTarget(String[] words, String target, int start) {
        int n = words.length;
        int min = Integer.MAX_VALUE;
        for(int j = 0;j<n;j++){
            if(words[j].equals(target)){
                int d = Math.abs(j-start);
                int circular = Math.min(d,n-d);
                min = Math.min(min,circular);
            }
        }
        return min == Integer.MAX_VALUE ? -1:min;
    }
    public static void main(String[] args){
    	String[] words = {"hello","i","am","world"};
    	System.out.println(closestTarget(words,"hello",1));
    }
}
