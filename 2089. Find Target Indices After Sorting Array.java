https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> al=new ArrayList<Integer>();
for(int i=0;i<nums.length;i++){
if(nums[i]==target)
al.add(i);
}
return al;
    }
}
