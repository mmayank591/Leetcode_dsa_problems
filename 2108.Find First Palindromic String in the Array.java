https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/?envType=daily-question&envId=2024-02-13

class Solution {
    public String firstPalindrome(String[] words) {
       StringBuilder str = new StringBuilder();
        for(int i=0;i<words.length;i++){
    str.append(words[i]);
    str.reverse();
    if(str.toString().equals (words[i]))
    return words[i];
str.setLength(0);



        }

return "";
    }
}
