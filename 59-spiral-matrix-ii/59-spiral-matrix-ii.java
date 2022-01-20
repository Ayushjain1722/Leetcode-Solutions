class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
        int entry = 1;
        
        HashSet<Pair> set = new HashSet<>();
        
        int i = 0;
        int rs = 0;
        int re = n-1;
        int cs = 0;
        int ce = n-1;
        
        while(i<=n/2){
            
            //------>
            for(int j=cs;j<=ce;j++){
                ans[rs][j] = entry;
                entry++;
            }    
            rs++;
            //Downwards
            for(int j=rs;j<=re;j++){
                ans[j][ce] = entry;
                entry++;
            }
            ce--;
            //<----------
            for(int j=ce;j>=cs;j--){
                ans[re][j] = entry;
                entry++;
            }
            re--;
            //Upwards
            for(int j=re;j>=rs;j--){
                ans[j][cs] = entry;
                entry++;
            }
            cs++;
            i++;
        }
        return ans;
    }
}