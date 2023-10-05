https://leetcode.com/problems/top-k-frequent-elements/description/?envType=daily-question&envId=2023-10-05

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] ans = new int[k];
        HashMap <Integer,Integer> map =new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       List<Integer> l = new ArrayList<>(map.keySet());
        Collections.sort(l, (a, b) -> map.get(b) - map.get(a));
        for (int i = 0; i < k; i++) {
            ans[i] = l.get(i);
        }    
    return ans;
    }
}
