class Solution {
    public int countSegments(String s) {
        if(s.length()<1)    return 0;
        String arr[] = s.split(" ");
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
            if(!arr[i].equals(""))
                ans++;
        }
        return ans;
    }
}