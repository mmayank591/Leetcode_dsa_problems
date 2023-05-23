
import java.util.*;

public class subarray_with_a_given_sum {
    public static boolean subarray(int a[], int sum) {
        Set<Integer> h = new HashSet<>();
        int prefix_sum = 0;
        for (int i = 0; i < a.length; i++) {
            prefix_sum += a[i];
            if (prefix_sum == sum)
                return true;
            if (h.contains(prefix_sum - sum)) {
                return true;
            } else {
                h.add(prefix_sum);

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        System.out.println("enter the " + n + " elements");
        int a[] = new int[n];
        for (int j = 0; j < a.length; j++) {
            a[j] = sc.nextInt();
        }
        System.out.println("enter the searching sum");
        sum = sc.nextInt();
        System.out.println(subarray(a, sum));

    }
}
