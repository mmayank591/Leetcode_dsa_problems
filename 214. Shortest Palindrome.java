https://leetcode.com/problems/shortest-palindrome/?envType=daily-question&envId=2024-09-20

class Solution {
    public String shortestPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String t = sb.toString();

        for (int i = 0; i < t.length(); i++) {

            if (s.startsWith(t.substring(i))) {
                return t.substring(0, i) + s;
            }

        }

        return t + s;

    }
}
