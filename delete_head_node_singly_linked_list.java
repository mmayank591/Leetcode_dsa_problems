import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int x) {
        data = x;
        prev = next = null;

    }
}
    class deledte_head_of_doubly_linked_list {
        public static Node del_head_node(Node head) {
            if (head == null || head.next == null)
                return null;
            else {
                head = head.next;
                head.prev = null;
                return head;
            }
        }

        public static void printlist(Node head) {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Node head = new Node(10);
            Node temp1 = new Node(20);
            Node temp2 = new Node(30);
            Node temp3 = new Node(40);
            head.next = temp1;
            temp1.prev = head;
            temp1.next = temp2;
            temp2.prev = temp1;
            temp2.next = temp3;
            temp3.prev = temp2;
            head = del_head_node(head);
            printlist(head);

        }

    }
