
import java.util.Stack;

public class StockSpan {
    public static void calSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 0 ; i < n ; i++) {

            while(!s.isEmpty() && prices[s.peek()] <= prices[i])  {
                s.pop();
            }

            span[i] = (s.isEmpty())? (i + 1) : (i - s.peek());

            s.push(i);
        }

        for (int i = 0; i < n ; i++) {
            System.out.print(span[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] stockPrices = {100, 80, 60, 70, 60, 75, 85};
        calSpan(stockPrices);
    }
}