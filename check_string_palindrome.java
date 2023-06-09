import java.util.*;

public class check_palindrome {

    public boolean palindrome(String a) {
        if (a.charAt(0) != a.charAt(a.length() - 1))
            return false;
        int begin = 0;
        int n = a.length();
        int end = n - 1;
        while (begin <= end) {
            if (a.charAt(begin) == a.charAt(end)) {
                begin++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("enter the strig to check for palindrone");
        a = sc.nextLine();
        check_palindrome ob = new check_palindrome();
        System.out.println(ob.palindrome(a));
    }
}
