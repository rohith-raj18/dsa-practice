
public class MinBitFlips {
    public static int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        int count = 0;
        while(ans > 0){
            ans &= (ans-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(minBitFlips(10,7));
    }
}
