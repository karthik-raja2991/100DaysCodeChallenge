public class Day1 {

    // problem statement: You are given an array prices where prices[i] is the price 
    // of a given stock on the ith day.You want to maximize your profit by choosing a 
    //single day to buy one stock and choosing a different day in the future to 
    //sell that stock.Return the maximum profit you can achieve from this transaction. 
    //If you cannot achieve any profit, return 0.
    
    public int BestTimeToBuyAndSellStock(int[] price)
    {
        int totalProfit = 0;
        int minimumPrizeToBuyStock = price[0];

        for(int i=1;i<price.length;i++)
        {
            int currentPrice = price[i] - minimumPrizeToBuyStock;

            if(currentPrice > totalProfit)
            {
                totalProfit = currentPrice;
            }

            minimumPrizeToBuyStock = Math.min(price[i], minimumPrizeToBuyStock);
        }

        return totalProfit;
    }
}
