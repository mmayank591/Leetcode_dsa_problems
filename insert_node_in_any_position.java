import java.util.*;

public class Firt_linked_list {
    int data;
    Firt_linked_list next;

    Firt_linked_list(int x) {
        data = 0;
        next = null;
    }

    public static void display(Firt_linked_list head) {
        Firt_linked_list curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
             curr = curr.next;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Firt_linked_list head = new Firt_linked_list(10);
        head.next = new Firt_linked_list(20);
        head.next.next = new Firt_linked_list(30);
        head.next.next.next = new Firt_linked_list(40);
        display(head);
    }

}
