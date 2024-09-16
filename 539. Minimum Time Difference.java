
https://leetcode.com/problems/minimum-time-difference/?envType=daily-question&envId=2024-09-16

class Solution {
    public int findMinDifference(List<String> timePoints) {

        ArrayList<Integer> al = new ArrayList<>();
        // StringBuilder sb=new StringBuilder();

        for (int i = 0; i < timePoints.size(); i++) {

            String sb = timePoints.get(i);
            int h = Integer.parseInt(sb.substring(0, 2));
            int m = Integer.parseInt(sb.substring(3));
            al.add(60 * h + m);
        }

        Collections.sort(al);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < al.size() - 1; i++) {
            min = Math.min(min, al.get(i + 1) - al.get(i));
        }

        return Math.min(min, 24 * 60 - al.get(al.size() - 1) + al.get(0));

    }
}
