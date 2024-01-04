https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM


public class Solution {
    public static int isSorted(int n, int []arr) {
        // Write your code here.
                for(int i=1;i<n;i++){
                    if(arr[i]<arr[i-1]){
                        return 0;
                    }
                }


return 1;

    }
}
