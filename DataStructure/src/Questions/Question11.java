package Questions;
import java.util.Arrays;//GPT Version

public class Question11 {
	    public static int coinChange(int[] coins, int amount) {
	        // Create an array to store the minimum number of coins needed for each amount.
	        int[] dp = new int[amount + 1];

	        // Initialize the dp array with a value that represents infinity (amount + 1).
	        Arrays.fill(dp, amount + 1);

	        // The minimum number of coins needed to make amount 0 is 0.
	        dp[0] = 0;

	        // Iterate through all possible amounts from 1 to the target amount.
	        for (int i = 1; i <= amount; i++) {
	            // For each amount, try all coin denominations.
	            for (int coin : coins) {
	                // If the current coin can be used to make the amount i, update dp[i].
	                if (coin <= i) {
	                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	                }
	            }
	        }

	        // If dp[amount] is still greater than amount, it means it's not possible to make that amount.
	        // Otherwise, return the minimum number of coins needed.
	        return dp[amount] > amount ? -1 : dp[amount];
	    }

	    public static void main(String[] args) {
	        int[] coins = {1, 2, 5};
	        int amount = 106;
	        int result = coinChange(coins, amount);
	        System.out.println("Minimum number of coins required: " + result);
	    }
	}


