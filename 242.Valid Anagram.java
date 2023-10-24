https://leetcode.com/problems/valid-anagram/description/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
          final int CHAR=256;
         int []count= new int[CHAR];
         for(int i=0;i<s.length();i++){
             count[s.charAt(i)]++;
             count[t.charAt(i)]--;
         }
         for(int i=0;i<CHAR;i++){
             if(count[i]!=0)
             //System.out.println(count[i]);
             return false;
         }
         return true;
    }
}
