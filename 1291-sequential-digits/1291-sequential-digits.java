class Solution {
    public List<Integer> getNumbers(int len){
        List<Integer> numbers = new ArrayList<>();
        int start = 1;
        while(10 - start >= len){
            int startTemp = start;
            StringBuffer str = new StringBuffer();
            for(int i=0;i<len;i++, startTemp++){
                str.append(startTemp);
            }
                
            start++;
            numbers.add(Integer.parseInt(str.toString()));
        }
        return numbers;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        
        String lowStr = "" + low;
        String highStr = "" + high;
        
        int initial_len = lowStr.length();
        int final_len = highStr.length();
        
        String nextNumber = "";
        int len = lowStr.length();
        while(len <= highStr.length()){
            List<Integer> nextNumbers = getNumbers(len); 
            for(Integer i: nextNumbers){
                if(low<=i && i<=high){
                    ans.add(i);
                }
            }
            len++;
        }
        return ans;
    }
}