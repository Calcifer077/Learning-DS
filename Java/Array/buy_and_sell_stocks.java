public class buy_and_sell_stocks {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[] = { 6, 5, 4, 3, 2, 1 };
        System.out.println(buyAndSellStocks(prices));
    }
}
