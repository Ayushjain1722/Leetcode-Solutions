class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;
        for(int i=0;i<s.length();i++)
            sumS += s.charAt(i)-'a' ;
        for(int i=0;i<t.length();i++)
            sumT += t.charAt(i) -'a' ;
        char ans = (char)(sumT - sumS +97) ;
        return ans;    
    }
}