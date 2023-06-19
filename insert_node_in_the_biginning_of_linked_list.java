import java.util.*;

public class Insert_node_in_the_beginning {
    int data;
    Insert_node_in_the_beginning next;

    Insert_node_in_the_beginning(int x) {
        data = x;
        next = null;
    }
    static Insert_node_in_the_beginning insert_begin(Insert_node_in_the_beginning head, int x) {
        Insert_node_in_the_beginning temp = new Insert_node_in_the_beginning(x);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        Insert_node_in_the_beginning head = null;
        head = insert_begin(head, 10);
        head = insert_begin(head, 20);
        head = insert_begin(head, 30);

    }
}
