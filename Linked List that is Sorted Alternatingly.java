https://www.geeksforgeeks.org/problems/linked-list-that-is-sorted-alternatingly/1
class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        Node curr=head;
        Node pre=null;
        
        LinkedList<Integer>al=new LinkedList<>();
        while(curr!=null){
            al.add(curr.data);
            curr=curr.next;
        }
        curr=head;
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            curr.data=al.get(i);
            curr=curr.next;
        }
        
        return head;
        
   }


}
