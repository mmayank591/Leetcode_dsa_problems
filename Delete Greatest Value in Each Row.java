class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
for(int i=0;i<grid.length;i++){
Arrays.sort(grid[i]);
}

for(int col=0;col<grid[0].length;col++){
        int max=0;

for(int row=0;row<grid.length;row++){
        if(grid[row][col]>max)
max=grid[row][col];
}
ans+=max;
}   
return ans;         
}
}


