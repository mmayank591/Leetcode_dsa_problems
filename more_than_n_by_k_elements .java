import java.util.HashMap;
import java.util.*;
//THIS IS THE NAIVE SOLUTION
/*public class more_than_n_by_k_elements {
    public static void mojority(int a[], int k) {

        Arrays.sort(a);
        int i = 1, count = 1, n = a.length;
        while (i < n) {

            while (i < n && a[i] == a[i - 1]) {
                count++;
                i++;
            }
            if (count > n / k) {
                System.out.println(a[i - 1] + " ");
        } 
        count = 1;
        i++;
    }

}
}*/
//THIS IS THE EFFICIENT SOLUTION

public class more_than_n_by_k_elements {

    public static void majority_elements(int a[], int k) {

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int x : a)
            m.put(x, m.getOrDefault(x, 0) + 1);

        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() > a.length / k) {

                System.out.println(e.getKey() + " ");
            }
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
        majority_elements(a, k);

    }

}
