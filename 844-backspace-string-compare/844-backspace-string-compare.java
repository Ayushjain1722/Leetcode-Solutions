class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(s.equals(t)) return true;
        int ptr1 = 0;
        int ptr2 = 0;
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!='#'){
                arr1[ptr1] = arr1[i];
                ptr1++;
            }else{
                if(ptr1!=0)
                    ptr1--;   
            }
        }
        
        for(int i=0;i<t.length();i++){
            if(arr2[i]!='#'){
                arr2[ptr2] = arr2[i];
                ptr2++;
            }else{
                if(ptr2!=0)
                    ptr2--;
            }
        }
        if(ptr1!=ptr2)  return false;
        for(int i=0;i<ptr1;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}