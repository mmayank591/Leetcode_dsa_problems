https://leetcode.com/problems/convert-1d-array-into-2d-array/description/?envType=daily-question&envId=2024-09-01

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ans[][] = new int[m][n];

        if (original.length != m * n) {
            return new int[0][0];
        }
        int p = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[p];
                p++;
            }
        }

        return ans;
    }
}
