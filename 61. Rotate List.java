https://leetcode.com/problems/rotate-list/description/

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

    public static ListNode rotate(int arr[], int k) {
        for (int i = 0; i < k; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));

        ListNode newhead = new ListNode(arr[0]);
        ListNode currr = newhead;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            currr.next = temp;
            currr = temp;
        }

        return newhead;

    }

    public ListNode rotateRight(ListNode head, int k) {

        if (k < 1 || head == null || head.next == null) {
            return head;
        }

        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        k %= size;
        int arr[] = new int[size];
        curr = head;
        int p = 0;
        while (curr != null) {
            arr[p] = curr.val;
            p++;
            curr = curr.next;

        }
        ListNode newhead = rotate(arr, k);
        return newhead;
    }
}
