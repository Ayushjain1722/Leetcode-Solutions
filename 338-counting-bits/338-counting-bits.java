class Solution {
    public int Helper(int n){
        int numberOfOnes = 0;
        while(n!=0){
            int x = n&1;
            numberOfOnes += x;
            n >>= 1;
        }
        
        return numberOfOnes;
    }
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = Helper(i);
        }
        return ans;
    }
}