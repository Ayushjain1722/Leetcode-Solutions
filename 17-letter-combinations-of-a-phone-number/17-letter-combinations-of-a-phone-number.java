class Solution {
    List<String> ans = new ArrayList<>();
    char c[][] = {{}, 
                  {}, 
                  {'a', 'b', 'c'},
                  {'d','e','f'},
                  {'g','h','i'},
                  {'j','k','l'},
                  {'m','n','o'},
                  {'p','q','r','s'},
                  {'t','u','v'},
                  {'w','x','y','z'}
                     };
    public void Helper(String digits, String combination){
        if(digits.length()<1){
           ans.add(combination);
            return; 
        }  
        char digit = digits.charAt(0);
        char possibilities[] = c[digit-'0'];
        for(int i=0;i<possibilities.length;i++){
            Helper(digits.substring(1), combination + possibilities[i]);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()<1)   return ans;
        Helper(digits, "");
        return ans;
    }
}