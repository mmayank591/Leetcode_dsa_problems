https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/?envType=daily-question&envId=2024-09-19

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        Arrays.sort(target);
        Arrays.sort(arr);
        String tar = "";
        String array = "";
        for (int i = 0; i < target.length; i++) {
            tar += target[i];
        }
        for (int i = 0; i < arr.length; i++) {
            array += arr[i];
        }

        if (tar.indexOf(array) == -1) {
            return false;
        }

        return true;

    }
}
