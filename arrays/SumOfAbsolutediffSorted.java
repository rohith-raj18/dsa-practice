public class SumOfAbsolutediffSorted {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] arr = new int[nums.length];
        int n = nums.length;
        // using prefix sum
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            pref[i] = pref[i-1]+nums[i];
        }
		
        for(int i = 0;i<nums.length;i++){
        // during first index we dont have left sum so just remove from right sum
            if(i == 0){
                arr[i] = pref[n-1] - nums[i]*(n);
                // if it is not first index then you can do left sum + right sum
                // here left sum means the number is already greater than the whole part so we simply remove the number from left sum and same for right sum like from number to the last element the right sum . in right sum we will subtract the number
            }else{
                arr[i] = nums[i]*i - pref[i-1] + (pref[n-1] - pref[i]) - nums[i]*(n-i-1);
            }
			// if last index then there is no right sum so simply number gets subtracted from left sum
            if(i == n-1){
                arr[i] = nums[i]*i - pref[i-1];
            }
            

        }
        return arr;
    }
}
