class Node {
    int data;
    Node prev;
    Node next;

    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}

public class doubley_linkedlist1 {
    public static Node insert_begin(Node head, int data) {
        Node temp = new Node(data);
         temp.next = head;
        if (head.next!= null) {
             head.prev=temp;
        }
        return temp;
    }
    public static void printlistNode(Node head){
Node curr=head;
while(curr!=null){
    System.out.print(curr.data+" ");
    curr=curr.next;
    
    }
    }


    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=insert_begin(head,40);
        printlistNode(head);

    }

}
