https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/?envType=daily-question&envId=2024-09-09

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int r = 0, k = 0, c = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            int rowmin = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < rowmin) {
                    rowmin = matrix[i][j];
                    r = i;
                    c = j;

                }

            }

            for (k = 0; k < row; k++) {
                if (matrix[k][c] > rowmin) {
                    break;
                }
            }
            if (k == row) {
                al.add(rowmin);
            }
        }

        return al;

    }
}
