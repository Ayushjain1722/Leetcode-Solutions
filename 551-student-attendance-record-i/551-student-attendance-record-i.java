class Solution {
    public boolean checkRecord(String s) {
        int absents = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                absents++;
                if(absents >= 2)    return false;
            }
            if(s.charAt(i)=='L' && 
               i+1<s.length() && s.charAt(i+1)=='L' &&
               i+2<s.length() && s.charAt(i+2)=='L')
                return false;
        }
        
        return true;
    }
}