
import java.util.Scanner;

public class checj_if_string_are_rotations {
    public static int rotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return -1;
        return ((s1 + s1).indexOf(s2, 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first string");
        String s1 = sc.nextLine();
        System.out.println("enter the secomd string");
        String s2 = sc.nextLine();
        if (rotations(s1, s2) != -1)
            System.out.println("yes present after " + rotations(s1, s2) + " rotations CLOCKWISE");
        else
            System.out.println("STRINGS ARE NOT ROTATIONS OF EACH OTHER");
    }
}
