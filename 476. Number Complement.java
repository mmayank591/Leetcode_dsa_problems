https://leetcode.com/problems/number-complement/description/?envType=daily-question&envId=2024-08-25

class Solution {
    public int findComplement(int num) {

        int num1 = num;
        StringBuilder s = new StringBuilder();

        while (num1 > 0) {
            s.insert(0, num1 % 2);
            num1 = num1 / 2;

        }

        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            s2.append(s.charAt(i) == '0' ? '1' : '0');
        }

        int integerValue = Integer.parseInt(s2.toString(), 2);

        System.out.println(s2.toString());
        return integerValue;

    }
}
