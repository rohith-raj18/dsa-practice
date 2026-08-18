public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }
        int k = 0;
        char[] arr = word.toCharArray();
        while(k < index+1){
            char temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
            k++;
            index--;
        }
        return new String(arr);
    }
}
