https://leetcode.com/problems/find-missing-observations/?envType=daily-question&envId=2024-09-05


class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {

        int len = rolls.length;
        int totallen = len + n;
        int totalsum = totallen * mean;
        int givensum = 0;
        for (int i = 0; i < len; i++) {
            givensum += rolls[i];

        }
        int remainingsum = totalsum - givensum;
        if (remainingsum < n || remainingsum > 6 * n) {
            return new int[0];
        }
        int nsum = 0;
        int ans[] = new int[n];
        int quotitent = remainingsum / n;
        int remainder = remainingsum % n;
        for (int i = 0; i < n; i++) {
            ans[i] = quotitent;
        }
        for (int i = 0; i < remainder; i++) {
            ans[i]++;// ans[i]+1;
        }

        return ans;

    }
}
