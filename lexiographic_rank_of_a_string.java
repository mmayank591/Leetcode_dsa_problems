
import java.util.*;

public class lexiographic_string {
    public static int factorial(int s) {
        int fact = 1;
        for (int i = 1; i <= s; i++) {
            fact *= i;
        }
        // System.out.println(fact);
        return fact;
    }

    public static int lexiographic(String s) {
        char ch;
        int rank = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int c = 0;
            ch = s.charAt(i);
            for (int j = i; j < s.length(); j++) {
                if (ch > s.charAt(j)) {
                    c++;
                }
            }
            // System.out.println(c+"* fact");
            rank += c * (factorial(s.length() - (i + 1)));

        }
        return rank + 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String s = sc.nextLine();

        System.out.println(lexiographic(s));
    }

}
