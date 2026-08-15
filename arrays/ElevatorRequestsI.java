public class ElevatorRequestsI {
    public int elevatorRequests(int n, int[] requests) {
        int time = requests[0];
        int j = requests[0];
        for(int i = 1;i<requests.length;i++){
            if(j == requests[i]){
                continue;
            }
            if(j > requests[i]){
                time += j - requests[i];
            }else{
                time += requests[i]-j;
            }
            j = requests[i];
        }
        return time;
    }
}
