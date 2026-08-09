public class MinTotalPriceDiscount {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int j = prices.length-1;
        int i = discounts.length-1;
        double sum = 0;
        while(i >= 0 && j>=0){
            sum += prices[j] * (100.0-discounts[i])/100.0;
            j--;
            i--;
        }
        while(j >= 0){
            sum += prices[j];
            j--;
        }
        return sum;
    }
}
