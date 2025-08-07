import java.util.*;
public class stocks {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buySellStocks(prices));
    }

    public static int buySellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;//todys profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
