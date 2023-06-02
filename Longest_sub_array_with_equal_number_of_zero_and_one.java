//This is the naive solution after this below is the efficient solution with the use of hashing

/*import java.util.*;

public class longest_sub_Array_with_equal_number_of_zeros_and_ones {

    public static int longest_sub_aarray(int a[]) {

        int c0 = 0, c1 = 0, res = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                if (a[j] == 1) {
                    c1++;
                } else{
                    c0++;
                }
                if (c0 == c1) {
                    res = Math.max(res, c0 + c1);
                }

            }

        }
        return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter " + n + " elements");
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        System.out.println("longets subarary is length is " + longest_sub_aarray(a));

    }
}*/
// NOW IS THE EFFICIENT SOLUTION FOR THIS QUESTION  USING HASHING 

import java.util.*;

public class longest_sub_Array_with_equal_number_of_zeros_and_ones {
    static final int sum = 0;

    public static int longest_sub_array(int a[]) {
        int presum = 0, res = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int j=0;j<a.length;j++){
            if(a[j]==0){
                a[j]=-1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            presum += a[i];
            if (presum == 0) {
                res = i + 1;
            }
            if (m.containsKey(presum) != true) {
                m.put(presum, i);
            }
            if (m.containsKey(presum - sum))
                res = Math.max(res, i - m.get(presum - sum));

        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter " + n + " elements");
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        System.out.println("longets subarary is length is " + longest_sub_array(a));

    }

}
