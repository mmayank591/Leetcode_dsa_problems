class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int c=0,temp;
        for(int i=0;i<nums.length;i++){
if(nums[i]%2==0)
{
temp=nums[i];
nums[i]=nums[c];
nums[c]=temp;
c++;
}
        }

return nums;
    }
}
