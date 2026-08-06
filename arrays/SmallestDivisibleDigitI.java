public class SmallestDivisibleDigitI {
    public int smallestNumber(int n, int t) {
        while(true){
            int x = product(n);
            if(x % t == 0){
                return n;
            }
            n++;
        }
    }
    public int product(int n){
        int res = 1;
        while(n > 0){
            int temp = n %10;
            res *= temp;
            n = n/10;
        }
        return res;
    }
}
