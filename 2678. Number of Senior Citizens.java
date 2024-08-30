https://leetcode.com/problems/number-of-senior-citizens/description/?envType=daily-question&envId=2024-08-30



class Solution {
    public int countSeniors(String[] details) {
        StringBuilder s = new StringBuilder();
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            int n = details[i].length();
            int age = Integer.valueOf(details[i].substring(n - 4, n - 2));
            if (age > 60) {
                count++;
            }
        }

        return count;

    }
}
