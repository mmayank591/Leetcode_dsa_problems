
//THIS IS THE NAIVE SOLUTION BELOW IS THE IMPROVED NAIVE SOLUTION
/*import java.util.Scanner;

public class pattern_searching {
    public static void ps(String txt, String patt) {

        int lp = patt.length();
        int ltxt = txt.length();
        for (int i = 0; i <=ltxt - lp; i++) {
            int j;
            for (j = 0; j < lp; j++) {
                if (patt.charAt(j) != txt.charAt(i + j))
                    break;
            }
            if (j == lp) {
                System.out.println(i + " ");
            }

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text  string");
        String s1 = sc.nextLine();
        System.out.println("enter the pattern string");
        String s2 = sc.nextLine();
        ps(s1, s2);
    }

}*/
//THIS IS THE IMPOROVED  NAIVE SOLUTION BUT IN THIS SOLUTION ALL THE CHARACTERS IN THE PATTERN STRING SHOULD BE DISTINCT

import java.util.Scanner;

public class pattern_searching {
    public static void ps(String txt, String patt) {

        int lp = patt.length();int c=0;
        int ltxt = txt.length();
        for (int i = 0; i <=ltxt - lp; ) {
            int j;
            for (j = 0; j < lp; j++) {
                if (patt.charAt(j) != txt.charAt(i + j))
                    break;
            }
            if (j == lp) {
                System.out.println(i + " ");
                c++;
            }
            if(j==0)
            i++;
            else
            i=i+j;

        }
        if(c==0)
        System.out.println(" not found");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text  string");
        String s1 = sc.nextLine();
        System.out.println("enter the pattern string");
        String s2 = sc.nextLine();
        ps(s1, s2);
    }

}
