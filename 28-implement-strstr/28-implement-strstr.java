class Solution {
    public int[] preCompute(String pattern){
        int preComputeArray[] = new int[pattern.length()];
        int i=1;
        int len = 0;
        preComputeArray[0] = 0;
        while(i<pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                preComputeArray[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = preComputeArray[len-1];
                }else{
                    preComputeArray[i] = 0;
                    i++;
                }
            }
        }
        return preComputeArray;
    }
    public int FMPAlgo(String str, String pattern){
        if(str.length() < pattern.length()) 
            return -1;
        int arr[] = preCompute(pattern);
        int i = 0;
        int j = 0;
        while(i<str.length()){
            if(str.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==pattern.length()){
                    return i-j;
                }
            }else{
                if(j!=0){
                    j = arr[j-1];
                    
                }else{
                    i++;
                }
            }
            
        }
        return -1;
    }
    public int strStr(String haystack, String needle) {
        if(haystack.length()<1){
            if(needle.length()<1)   return 0;
            else return -1;
        }
        if(needle.length()<1)   return 0;
        //The basic FMP algo
        return FMPAlgo(haystack, needle);
    }
}