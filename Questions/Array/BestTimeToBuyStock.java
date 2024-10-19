// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. 
// However, you can buy it then immediately sell it on the same day.
// Find and return the maximum profit you can achieve.

package Questions.Array;

class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int start = prices[0];
        int len = prices.length;
        for(int i = 1; i < len; i++){
            if(prices[i] > start){
                max += prices[i] - start;
            }
            start = prices[i];
        }
        return max;
    }

    //          [ Time complexity: O(N)] [ Space complexity: O(1) ]

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int solution = maxProfit(prices);
        System.out.println(solution);
    }
}