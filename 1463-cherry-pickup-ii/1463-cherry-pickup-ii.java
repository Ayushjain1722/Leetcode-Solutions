class Solution {
    public int getMax(int ans1, int ans2, int ans3, int ans4, int ans5, int ans6, int ans7, int ans8, int ans9){
        return Math.max(ans1, Math.max(ans2, Math.max(ans3, Math.max(ans4, Math.max(ans5, Math.max(ans6, Math.max(ans7, Math.max(ans8, ans9))))))));
    }
    public int Helper(int grid[][], int dp[][][], boolean visited[][], int i1, int j1, int i2, int j2){
        if(i1<0 || i2<0 || j1<0 || j2<0 || i1>grid.length-1 || i2>grid.length-1 || j1>grid[0].length-1 || j2>grid[0].length-1)
            return 0;
        if(dp[i1][j1][j2]!=-1){
            return dp[i1][j1][j2];
        }
        int x=0, y=0;
        if(i1==i2 && j1==j2){
            x = grid[i1][j1];
        }else{
            x = grid[i1][j1];
            y = grid[i1][j2];
        }
        int ans1 = x + y + Helper(grid, dp, visited, i1+1, j1-1, i2+1, j2-1);
        int ans2 = x + y + Helper(grid, dp, visited, i1+1, j1-1, i2+1, j2);
        int ans3 = x + y + Helper(grid, dp, visited, i1+1, j1-1, i2+1, j2+1);
        int ans4 = x + y + Helper(grid, dp, visited, i1+1, j1, i2+1, j2-1);
        int ans5 = x + y + Helper(grid, dp, visited, i1+1, j1, i2+1, j2);
        int ans6 = x + y + Helper(grid, dp, visited, i1+1, j1, i2+1, j2+1);
        int ans7 = x + y + Helper(grid, dp, visited, i1+1, j1+1, i2+1, j2-1);
        int ans8 = x + y + Helper(grid, dp, visited, i1+1, j1+1, i2+1, j2);
        int ans9 = x + y + Helper(grid, dp, visited, i1+1, j1+1, i2+1, j2+1);
        dp[i1][j1][j2] = getMax(ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9);
        return dp[i1][j1][j2];
        
    }
    public int cherryPickup(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int dp[][][] = new int[grid.length][grid[0].length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                for(int k=0;k<dp[0].length;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return Helper(grid, dp, visited, 0,0, 0, grid[0].length-1);
        
    }
}