class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
        next = prev = null;

    }
}

public class insert_at_the_end_doubly_linked_list {
    public static Node insert_last(Node head, int data) {

        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

public static void printlist(Node head){
     Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
}
}
 public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=insert_last(head,40);
    	printlist(head);
    	
    } 

}
