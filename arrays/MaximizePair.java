public class MaximizePair {
    public long maxPairStrength(int[] nums) {
        long max = 0;
        long sum = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                long a = (long)nums[i];
                long b = (long)nums[j];
                sum = (long)((a*b) / Math.pow(gcd(a,b),2));
                max = Math.max(sum,max);
            }
        }
        return max;
    }
    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return (long)a;
    }
}
