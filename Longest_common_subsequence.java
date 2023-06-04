//THIS IS THE NAIVE METHOD SOLITION OF THIS QUESTION  WITH TIME COMPLEXTITY O(NLOGN) 
//BELOW THIS CODE A MORE EFFICIENT SOLUTION USING HASHING IS  APPLIED WITH LINEAR TIME COMPLEXITY

/*
import java.util.Arrays;
import java.util.*;

public class Longest_consecutive_element {

    public static int longest_consecutive(int a[]) {

        int res=1,curr=1;
        int p = 0, k = 9;
        Arrays.sort(a);
        for (int i = 1; i < a.length ; i++) {

            if (a[i ] - a[i-1] == 1) {
                curr++;
            }


else if(a[i]!=a[i-1]){

    res=Math.max(res, curr);
    curr=1;
}

        }

     return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter " + n + " elements");
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        System.out.println("longest consecutive subarary is of length  " + longest_consecutive(a));

    }
}*/
//NOEW IS THE HASHING IMPLEMENTATION OF THE ABOVE PROBLEM IN LINEAR TIME 
import java.util.*;

public class Longest_consecutive_element {
    public static int longest_consecutive(int a[]) {
        Set<Integer> h = new HashSet<>();
        int res = 1, curr = 1;
        for (int i = 0; i < a.length; i++) {
            h.add(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (h.contains(a[i] - 1) != true) {
                curr = 1;
                while (h.contains(a[i] + curr)) {
                    curr++;
                    res = Math.max(res, curr);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter " + n + " elements");
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        System.out.println("longest consecutive subarary is of length  " + longest_consecutive(a));

    }
}
