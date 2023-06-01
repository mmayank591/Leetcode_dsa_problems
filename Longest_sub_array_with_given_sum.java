
//THIS IS NAIVE METHOD WITH TIME COMPLEXITY O(N^2)
//BELOW I HAVE USED HASHING METHOTOLOGY TO SIMPLIFY THE TIME COMPLEXITY TO O(N)
/*import java.util.*;
public class longest_sub_array_with_given_sum {

    public static int long_subarray(int a[], int sum) {
        int curr_sum = 0;
        int sum_len = 0;
        int p = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            curr_sum = 0;
            p = 0;
            sum_len = 0;
            for (int j = i; j < a.length; j++) {

                curr_sum += a[j];
                p++;
                if (curr_sum == sum) {
                    sum_len = p;
                    break;
                }
            }
            if (sum_len > max) {
                max = sum_len;
            }

        }
        return max;
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
        System.out.println("please enter the sum to be found");
        int sum=sc.nextInt();
        System.out.println( "length of longest subarray is "+long_subarray(a,sum));

    }

}*/
// HASHMAPINPMLEMENTATION OF THE ABOVE CODE

import java.util.*;

public class longest_sub_array_with_given_sum {
    public static int longest_sub_array(int a[], int sum) {
        int presum = 0, res = 0;
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            presum += a[i];

            if (presum == sum) {
                res = i + 1;
            }
            if (m.containsKey(presum) != true) {
                m.put(presum, i);
            }
            if (m.containsKey(presum - sum)) {
                res = Math.max(res, i - m.get(presum - sum));
            }
        } // FOR LOOP CLOSED
        return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("enter the size of array");

        n = sc.nextInt();
        System.out.println("enter the " + n + " elements");
        int a[] = new int[n];
        for (int j = 0; j < a.length; j++) {
            a[j] = sc.nextInt();
        }
        System.out.println("please enter the sum to be found");
        int sum = sc.nextInt();
        System.out.println("length of longest subarray is " + longest_sub_array(a, sum));

    }
}
