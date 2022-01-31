class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int accountsTotal = 0;
            for(int j=0;j<accounts[i].length;j++){
                accountsTotal += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, accountsTotal);
        }
        return maxWealth;
    }
}