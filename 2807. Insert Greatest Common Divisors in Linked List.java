https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/?envType=daily-question&envId=2024-09-10

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

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr1 = head;
        ListNode curr2 = head.next;

        while (curr2 != null) {

            int gcdvalue = gcd(curr1.val, curr2.val);
            ListNode newnode = new ListNode(gcdvalue);
            curr1.next = newnode;
            newnode.next = curr2;
            curr1 = curr2;
            curr2 = curr2.next;

        }

        return head;

    }
}
