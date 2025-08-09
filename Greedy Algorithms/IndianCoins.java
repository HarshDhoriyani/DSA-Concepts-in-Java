import java.util.*;

public class IndianCoins {

    public static void main(String[] args) {
        Integer coins[] = {1, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countofCoins = 0;
        int amount = 1250;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0 ; i < coins.length ; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countofCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Minimum number of coins/notes used : " + countofCoins);

        System.out.println("Coins/Notes Used : ");
        for(int i = 0 ; i < ans.size() ; i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}