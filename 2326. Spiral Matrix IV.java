https://leetcode.com/problems/spiral-matrix-iv/?envType=daily-question&envId=2024-09-09

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];

        for (int[] r : res) {
            Arrays.fill(r, -1);
        }

        ListNode curr = head;

        int rowbegin = 0;
        int rowend = m - 1;
        int colstart = 0;
        int colend = n - 1;
        while (rowbegin <= rowend && colstart <= colend && curr != null) {

            for (int i = colstart; i <= colend && curr != null; i++) {
                if (curr != null) {
                    res[rowbegin][i] = curr.val;
                }
                curr = curr.next;
            }
            rowbegin++;
            for (int i = rowbegin; i <= rowend && curr != null; i++) {

                if (curr != null) {
                    res[i][colend] = curr.val;
                }
                curr = curr.next;
            }
            colend--;
            for (int i = colend; i >= colstart && curr != null; i--) {
                if (curr != null) {
                    res[rowend][i] = curr.val;
                }
                curr = curr.next;
            }
            rowend--;

            for (int i = rowend; i >= rowbegin && curr != null; i--) {
                if (curr != null) {
                    res[i][colstart] = curr.val;
                }
                curr = curr.next;
            }
            colstart++;

        }

        return res;

    }
}
