https://leetcode.com/problems/maximum-split-of-positive-even-integers/description/

class Solution {
    public List<Long> maximumEvenSplit(long finalsum) {
        if (finalsum % 2 != 0) {
            return new ArrayList<>();

        }

        long sum = 0;
        long i = 2;
        List<Long> ans = new ArrayList<>();

        while (sum <= finalsum) {
            if (sum + i > finalsum)
                break;
            sum += i;
            ans.add(i);
            i += 2;
        }
        if (sum == finalsum) {
            return ans;
        }

        long lastindexelement = ans.get(ans.size() - 1);
        ans.remove(lastindexelement);
        ans.add(lastindexelement + (finalsum - sum));

        return ans;

    }
}
