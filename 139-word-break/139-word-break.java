class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1;i<dp.length;i++){
            if(dp[i]==false){
                if(wordDict.contains(s.substring(0,i))){
                    dp[i] = true;
                }
            }
            if(dp[i]==true){
                if(i==s.length())   return true;
                for(int j=i+1;j<=s.length();j++){
                    if(wordDict.contains(s.substring(i, j))){
                        if(j==s.length()) return true;
                        dp[j] = true;
                    }            
                }
            }
        }
        return false;
//         boolean dp[] = new boolean[s.length()+1];
//         dp[0] = true;
//         for(int i=1;i<dp.length;i++)
//         {
//             if(dp[i]==false && wordDict.contains(s.substring(0,i)))
//                 dp[i] = true;
//             if(dp[i]==true)
//             {
//                 if(i==s.length())
//                     return true;
//                 for(int j=i+1;j<dp.length;j++)
//                 {
//                     if(dp[j]==false && wordDict.contains(s.substring(i,j)))
//                         dp[j] = true;
//                     if(j==s.length() && dp[j] == true)
//                         return true;
//                 }    
//             }
            
//         }
//         return false;
    }
}