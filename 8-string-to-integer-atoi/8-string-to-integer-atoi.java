class Solution {
    public int myAtoi(String s) {
        int integer = 0;
        int i = 0;
        int sign = 1;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }else if(i < s.length() && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit = s.charAt(i)-'0';
            if(integer > Integer.MAX_VALUE/10 || 
               (integer == Integer.MAX_VALUE /10 && digit > Integer.MAX_VALUE % 10)){
                return sign == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            integer = integer*10 + digit;
            i++;
        }
        return sign*integer;
    }
}