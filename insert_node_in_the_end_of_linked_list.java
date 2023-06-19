public class Node3 {
    int data;
    Node3 next;

    Node3(int x) {
        data = x;
        next = null;
    }

    public static Node3 insertlast(Node3 head, int x) {
        Node3 temp = new Node3(x);
        if (head == null) {
            return temp;
        }
        Node3 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;

    }

    public static void main(String[] args) {
        Node3 head = null;
        head = insertlast(head, 10);
        head = insertlast(head, 20);
        head = insertlast(head, 30);
        head = insertlast(head, 40);
    }

}
