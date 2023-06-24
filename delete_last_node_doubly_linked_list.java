
class Node {

    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = prev = null;
    }
}

class delete_last_node_of_doubly_llinked_list {
    public static Node del_last_node(Node head) {

        if (head == null || head.next == null)
            return null;
        Node curr = head;
        while (curr .next!= null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(30);
        Node temp2 = new Node(40);
        Node temp3 = new Node(50);
        Node temp4 = new Node(60);
        head.next=temp1;
        temp1.prev = head;
         temp1.next=temp2;
        temp2.prev = temp1;
        temp2.next =temp3 ;
        temp3.prev = temp2;
         temp3.next=temp4 ;
        temp4.prev = temp3;
        head=del_last_node(head);
        printlist(head);
    }

}
