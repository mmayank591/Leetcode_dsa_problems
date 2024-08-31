https://leetcode.com/problems/decompress-run-length-encoded-list/description/
class Solution {
    public int[] decompressRLElist(int[] nums) {
    ArrayList<Integer> al=new ArrayList<>();
        int  i=0;int j=1;
        while(j<nums.length){
             int freq=nums[i];int value=nums[j];
            for(int k=0;k<freq;k++){
                al.add(value);
            }
                i+=2;j+=2;
        }
int ans[]=new int[al.size()];
for(int p=0;p<ans.length;p++){
    ans[p]=al.get(p);
}
return ans;
    }
}
