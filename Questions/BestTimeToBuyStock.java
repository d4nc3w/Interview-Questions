package Questions;

class Solution {
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

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int solution = maxProfit(prices);
        System.out.println(solution);
    }
}