class Solution {
    public boolean isMatch(String s, String p) {
        boolean dp[][] = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        //Empty string cannot match the pattern.
        for(int i=1;i<dp.length;i++){
            dp[i][0] = false;
        }
        //Empty String can only match pattern if there were * in it.
        for(int i=1;i<dp[0].length;i++){
            if(p.charAt(i-1)=='*')
                dp[0][i] = dp[0][i-1];
        }
        //Now check for the rest of the elements..
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                //If the characters match, then check if the prefix till now is matching or not
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                if(p.charAt(j-1)=='*'){
                    //We can have two cases here: 1. We just convert the asterik into the string character by taking in the last character and 2. We can make asterik an empty string
                    dp[i][j] = dp[i-1][j] | dp[i][j-1];
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}