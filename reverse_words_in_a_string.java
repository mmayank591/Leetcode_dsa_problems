import java.util.*;

public class reverse_words_in_a_string {
    public static void reverse_words(String a) {
        String ch = "";
        int n = a.length();
        int k = 0;
        for (int i = n - 1; i >= 0; i--) {
            ch += a.charAt(i);
            if (a.charAt(i) == ' ') {
                k = ch.length() - 1;
                while (k >= 0) {
                    System.out.print(ch.charAt(k) + "");
                    k--;
                }
                ch = " ";
            }
        }
        for (int j = 0; j < a.length(); j++) {
            System.out.print(a.charAt(j));
            if (a.charAt(j) == ' ')
                break;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  string");
        String s1 = sc.nextLine();

        reverse_words(s1);
    }

}
