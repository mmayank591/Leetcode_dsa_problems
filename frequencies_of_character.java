
import java.util.Scanner;
import java.util.Arrays;

public class Frequencies_of_characters {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int count[] = new int[26];
        Arrays.fill(count, 0);
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        } // HERE WE ARE STORING THE CHARACTER IN THE COUNT ARRAY AS PER ITS LOCATION IN
          // THE ENGLISH ALPHABET
        for (int j = 0; j < 26; j++) {
            if (count[j] > 0)
                System.out.println((char) (j + 'a') + " " + count[j]);
        }

    }

}
