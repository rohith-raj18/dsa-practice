public class ReverseWordsIII {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        for(int i = 0;i<words.length;i++){
            char[] arr = words[i].toCharArray();
            reverse(arr);
            words[i] = new String(arr);
        }
        return String.join(" ",words);
    }
    public static void reverse(char[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args){
        System.out.println(reverseWords("hello world"));
     }
}
