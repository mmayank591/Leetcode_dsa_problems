https://leetcode.com/problems/find-the-key-of-the-numbers/description/

class Solution {
    public int generateKey(int num1, int num2, int num3) {

        String n1 = String.valueOf(num1);
        String n2 = String.valueOf(num2);
        String n3 = String.valueOf(num3);
        if (n1.length() < 4) {
            int l1 = n1.length();
            for (int i = 0; i < 4 - l1; i++) {
                n1 = "0".concat(n1);
            }
        }
        if (n2.length() < 4) {
            int l2 = n2.length();
            for (int i = 0; i < 4 - l2; i++) {
                n2 = "0".concat(n2);
            }
        }
        if (n3.length() < 4) {
            int l3 = n3.length();
            for (int i = 0; i < 4 - l3; i++) {
                n3 = "0".concat(n3);
            }
        }
        int key[] = new int[4];
        for (int i = 0; i < 4; i++) {
            key[i] = (n1.charAt(i) - '0') < (n2.charAt(i) - '0') ? Math.min((n1.charAt(i) - '0'), (n3.charAt(i) - '0'))
                    : Math.min((n2.charAt(i) - '0'), (n3.charAt(i) - '0'));
        }

        String str = "0";

        int i = 0;
        while (i < key.length) {
            if (key[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        int ans = 0;
        for (int k = i; k < key.length; k++) {
            ans = ans * 10 + key[k];
        }
        return ans;

    }
}
