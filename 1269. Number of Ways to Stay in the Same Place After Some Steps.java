https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/?envType=daily-question&envId=2023-10-15

class Solution {
    public int numWays(int steps, int arrLen) {
        final int MOD = 1000000007;

        int maxIndex = Math.min(steps / 2, arrLen - 1);

        int[][] dp = new int[2][maxIndex + 1];
        dp[0][0] = 1;

        for (int step = 1; step <= steps; step++) {
            int current = step % 2;
            int prev = (step - 1) % 2;

            for (int index = 0; index <= maxIndex; index++) {
                dp[current][index] = dp[prev][index] % MOD;

                if (index > 0) {
                    dp[current][index] = (dp[current][index] + dp[prev][index - 1]) % MOD;
                }

                if (index < maxIndex) {
                    dp[current][index] = (dp[current][index] + dp[prev][index + 1]) % MOD;
                }
            }
        }

        return dp[steps % 2][0];
    }
}
