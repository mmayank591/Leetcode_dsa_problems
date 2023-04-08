class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int count=0;
        int sum=0;
         int ans[]=new int[queries.length];
        Arrays.sort(nums);

        for(int i=0;i<queries.length;i++){
            for(int j=0;j<nums.length;j++){
                if(sum+nums[j] > queries[i])
                    break;
                sum+=nums[j];
                count++;
            }

            ans[i]=count;sum=0; count=0;
        }
        return ans;
    }
}
