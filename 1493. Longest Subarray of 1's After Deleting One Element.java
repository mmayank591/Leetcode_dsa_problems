class Solution {
    public int longestSubarray(int[] nums) {
       int tail=0,cnt=0,ans=0;
       for(int head=0;head<nums.length;head++){
           if(nums[head]==0)
           cnt++;
           while(cnt>1){
               if(nums[tail]==0)
               cnt--;
               tail++;

           }
           ans=Math.max(ans,head-tail);
       } 
          return ans;
    }
 
}
