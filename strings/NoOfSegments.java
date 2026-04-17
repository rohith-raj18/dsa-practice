import java.util.*;
public class NoOfSegments{
	public static int countSegments(String s) { 
        s = s.trim();
        if(s.equals("")){
            return 0;
        }
        return s.split("\\s+").length;
    }
	public static void main(String[] args){
		System.out.println(countSegments("hello i am rohith"));
	}
}
