class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxProfit=0;
        for(int i=0;i<prices.size();i++){
            int buy=prices[i];
            int sell=0;
            for(int j=i+1;j<prices.size();j++){
                 sell=max(sell,prices[j]);
            }

            int profit=sell-buy;
            maxProfit=max(maxProfit,profit);
        }

        return maxProfit;
    }
};
