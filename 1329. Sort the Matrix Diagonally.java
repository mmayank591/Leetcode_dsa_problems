https://leetcode.com/problems/sort-the-matrix-diagonally/description/

class Solution {
    public int[][] diagonalSort(int[][] mat) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int key = i - j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);

            }

        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            Collections.sort(entry.getValue());
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int key = i - j;
                mat[i][j] = map.get(key).remove(map.get(key).size() - 1);

            }
        }

        return mat;
    }
}
