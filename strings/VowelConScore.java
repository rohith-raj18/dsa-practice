
public class VowelConScore {
    public static int vowelConsonantScore(String s) {
        int vowel = 0;
        int cons = 0;
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowel++;
            }else if(Character.isLetter(c)){
                cons++;
            }
        }
        if(cons == 0){
            return 0;
        }
        return vowel/cons;
    }
    public static void main(String[] args){
        System.out.println(vowelConsonantScore("a"));
     }
}
