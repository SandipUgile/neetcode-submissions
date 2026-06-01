class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j =1,maxPro = 0;

        while(j < prices.length){
            if(prices[i] < prices[j]){
                maxPro = Math.max(maxPro,prices[j] - prices[i]);
            }else{
                i = j;
            }
            j++;
        }
        return maxPro;
    }
}
