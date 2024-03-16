https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1

class Solution
{
    void deleteNode(Node del_node)
    {
         // Your code here
         del_node.data=del_node.next.data;
         del_node.next=del_node.next.next;
         
         
         
    }
}

