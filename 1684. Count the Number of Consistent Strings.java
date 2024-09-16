https://leetcode.com/problems/count-the-number-of-consistent-strings/description/?envType=daily-question&envId=2024-09-16

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        int c = 0;
        for (int i = 0; i < allowed.length(); i++) {
            hs.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {
            int flag = 1;
            String word = words[i];
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (!hs.contains(word.charAt(j))) {
                    flag = 0;
                    break;
                }
            }
            c += flag;
        }

        return c;

    }
}
