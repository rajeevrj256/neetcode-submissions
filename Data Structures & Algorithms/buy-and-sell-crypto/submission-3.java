class Solution {
    public int maxProfit(int[] prices) {
        int buyValue=Integer.MAX_VALUE;


        int maxProfit=0;
        for(int price:prices){
            buyValue=Math.min(buyValue,price);
            
            int profit=price-buyValue;

            maxProfit=Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}
