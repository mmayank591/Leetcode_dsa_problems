
class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               set.add(mat1[i][j]);
            }
        }
        
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(x-mat2[i][j])){
                    count++;
                }
            }
        }
        
        
        return count;
        
    }
}
