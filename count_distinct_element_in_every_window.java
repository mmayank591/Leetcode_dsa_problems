

//this is a naive solution
import java.util.HashSet;
import java.util.Scanner;

public class count_Distinct_element_in_every_window {

    public static void distinct_element(int a[], int k) {
        int curr = 0, n = a.length;
        int size[] = new int[n - k + 1];
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < (n - k + 1); i++) {
            curr = 0;
            for (int j = i; j < k+i; j++) {
                h.add(a[j]);
            }
            size[i] = h.size();
            h.clear();

        }
        System.out.println("count of distinct elements are");
        for (int i = 0; i < n - k + 1; i++) {
            System.out.print(size[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("enter the size of array");

        n = sc.nextInt();
        System.out.println("enter the " + n + " elements");
        int a[] = new int[n];
        for (int j = 0; j < a.length; j++) {
            a[j] = sc.nextInt();
        }
        System.out.println("please enter the value of k ");
        int k = sc.nextInt();
        distinct_element(a, k);

    }

}
//
