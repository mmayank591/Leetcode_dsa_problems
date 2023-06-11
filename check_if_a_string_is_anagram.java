// THIS IS THE NAIVE METHOD EFFICIENT METHOD IS DISCUSSED BELOW
/*import java.util.*;

public class check_if_a_string_is_anagram {
    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);
        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);
        return s1.equals(s2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String s1 = sc.nextLine();
        System.out.println();
        System.out.println("enter the second string");
        String s2 = sc.nextLine();
        System.out.println(anagram(s1, s2));
    }
}
*/

//THIS IS EFFIECIENT METHOD
import java.util.*;
public class check_if_a_string_is_anagram {

    public static boolean anagram(String s1, String s2) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch1=s1.charAt(i);
            sum1 +=ch1; 
        }
        for (int j = 0; j < s2.length(); j++) {
            char ch2=s2.charAt(j);
            sum2+= ch2;
        }
        if (sum1 == sum2)
            return true;
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String s1 = sc.nextLine();
        System.out.println();
        System.out.println("enter the second string");
        String s2 = sc.nextLine();
        System.out.println(anagram(s1, s2));
    }
}
