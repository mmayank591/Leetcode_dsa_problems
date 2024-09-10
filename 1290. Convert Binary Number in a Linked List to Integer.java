https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }

      int i=size-1;int ans=0;
      curr=head;
      while(curr!=null){
        if(curr.val==1)
        ans+=Math.pow(2,i);
        i--;
        curr=curr.next;
      }


return ans;
    }
}
