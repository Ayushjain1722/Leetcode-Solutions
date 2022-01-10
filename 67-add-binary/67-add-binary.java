class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder ans = new StringBuilder();
        while(i>=0 && j>=0){
            if((a.charAt(i)=='0' && b.charAt(j)=='1') || (a.charAt(i)=='1' && b.charAt(j)=='0')){
                if(carry==0){
                    ans.append(1);
                }else{
                    ans.append(0);
                }
            }
            else if(a.charAt(i)=='1' && b.charAt(j)=='1'){
                if(carry==0){
                    ans.append(0);
                    carry = 1;
                }else{
                    ans.append(1);
                }
            }else{
                if(carry==0){
                    ans.append(0);
                }else{
                    ans.append(1);
                    carry = 0;
                }
            }
            i--;
            j--;
        }
        while(i>=0){
            if(carry==0){
                ans.append(a.charAt(i));
            }else{
                if(a.charAt(i)=='0'){
                    ans.append(1);
                    carry = 0;
                }else{
                    ans.append(0);
                    carry = 1;
                }
            }
            i--;
        }
        while(j>=0){
            if(carry==0){
                ans.append(b.charAt(j));
            }else{
                if(b.charAt(j)=='0'){
                    ans.append(1);
                    carry = 0;
                }else{
                    ans.append(0);
                    carry = 1;
                }
            }
            j--;
        }
        if(carry==1){
            ans.append(1);
        }
        return ans.reverse().toString();
    }
}