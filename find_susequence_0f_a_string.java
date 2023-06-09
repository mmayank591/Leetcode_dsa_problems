
//THIS IS THE ITERATIVE VERSION BELOW IS THE RECURSIVE VERSION
/*import java.util.Scanner;
public class check_if_string_is_subsequence_of_other {
    public static boolean subsequence(String s1, String s2) {
        int k = 0, l1 = s1.length(), l2 = s2.length();
        String temp;
        if (l1 < l2) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }
        for (int i = 0; i < l1 && k < l2; i++) {
            if (s1.charAt(i) == s2.charAt(k)) {
                k++;
            }
        }
        if (k == l2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first string");
        String s1 = sc.nextLine();
        System.out.println("enter the second string which is to be checked for susequence");
        String s2 = sc.nextLine();
        System.out.println(subsequence(s1, s2));

    }
}*/
import java.util.*;

public class check_if_string_is_subsequence_of_other {

    public static boolean subsequence(String s1, String s2,int l1,int l2) {
      
        
        if (l1 == 0)
            return true;

        if (l2==0) {
           return true;
        }
        if(s1.charAt(l1-1)==s2.charAt(l2-1)){
            return subsequence(s1, s2, l1-1, l2-1);
        }
       else{

     return  subsequence(s1, s2,l1-1,l2);
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first string");
        String s1 = sc.nextLine();
        System.out.println("enter the second string which is to be checked for susequence");
        String s2 = sc.nextLine();
        int l1=s1.length(),l2=s2.length();
        System.out.println(subsequence(s1, s2,l1,l2));

    }

}
