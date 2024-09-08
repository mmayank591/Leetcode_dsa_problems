https://leetcode.com/problems/split-linked-list-in-parts/description/?envType=daily-question&envId=2024-09-08


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

    public static int getSize(ListNode head) {
        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {

        int length = getSize(head);
        int extranode = length % k;
        ListNode[] ans = new ListNode[k];

        ListNode curr = head;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            ans[i] = curr;

            for (int count = 0; count < (length / k) + (extranode > 0 ? 1 : 0); count++) {

                prev = curr;
                curr = curr.next;
            }
            if (prev != null) {
                prev.next = null;
            }
            extranode--;

        }

        return ans;
    }
}
