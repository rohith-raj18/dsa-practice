public class MeanOfArray {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int remove = n*5/100;
        int count = 0;
        double sum = 0;
        for(int i = remove;i< n-remove;i++){
            sum += arr[i];
            count++;
        }
        return sum/count;
    }
}
