public class SumPrimeRev{
	public static int sumOfPrimesInRange(int n) {
        int start = Math.min(n,reverse(n));
        int end = Math.max(n,reverse(n));
        int sum = 0;
        for(int i = start;i<=end;i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static int reverse(int n){
        int sum = 0;
        while(n > 0){
            int temp = n % 10;
            sum = sum*10 + temp;
            n = n/10;
        }
        return sum;
    }
    public static boolean isPrime(int n) {

    if (n < 2) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {

        if (n % i == 0) {
            return false;
        }
    }

    return true;
    }
    public static void main(String[] args){
    	System.out.println(sumOfPrimesInRange(13));
    }
}
