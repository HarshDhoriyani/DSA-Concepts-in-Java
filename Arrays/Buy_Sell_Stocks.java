import java.util.Scanner;

public class Stocks {
    public static int buy_sell_stocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {   // prices[i] = sellPrice --- Profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        
        int prices[] = new int[n];
        System.out.println("Enter stock prices for " + n + " days:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = buy_sell_stocks(prices);
        System.out.println("MAXIMUM PROFIT IS: " + result);

        sc.close();
    }
}
