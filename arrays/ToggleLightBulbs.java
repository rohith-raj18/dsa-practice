import java.util.*;
public class ToggleLightBulbs{
	public static List<Integer> toggleLightBulbs(List<Integer> bulbs) {
    
        Set<Integer> set = new TreeSet<>();
        for(int i:bulbs){
            if(set.contains(i)){
               set.remove(i);
            }else{
                set.add(i);
                
            }
            
        }
        return new ArrayList<>(set);
    }
   
}
