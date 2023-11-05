https://leetcode.com/contest/weekly-contest-370/submissions/detail/1091731410/

class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            boolean isChampion = true;
            for (int j = 0; j < n; j++) {
                if (i != j && grid[i][j] == 0) {
                    isChampion = false;
                    break;
                }
            }
            if (isChampion) {
                return i;
            }
        }

        return -1; // No champion found
    }
}
