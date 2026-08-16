public class MinimizeTheMaxWait {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max=0;
        for(int J:lights){
            max = Math.max(J,max);
        }
        int ans = 0;
        for(int i =0;i<arrivalTime.length;i++){
            int r = arrivalTime[i] % period;

            int wait = 0;
            if(r < max){
                wait = 0;
            }else{
                wait = period - r;
            }
            ans = Math.max(ans,wait);
        }
        return ans;
    }
}
