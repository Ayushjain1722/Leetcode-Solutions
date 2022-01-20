class Solution {
    public String[] findRelativeRanks(int[] score) {
        int temp[] = new int[score.length];
        for(int i=0;i<score.length;i++){
            temp[i] = score[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(temp[i], score.length-i);
        }
        String ans[] = new String[score.length];
        for(int i=0;i<score.length;i++){
            if(score[i]==temp[temp.length-1]){
                ans[i] = "Gold Medal";
            }else if(score.length >= 2 && score[i]==temp[temp.length-2]){
                ans[i] = "Silver Medal";
            }else if(score.length >=3 && score[i]==temp[temp.length-3]){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = "" + map.get(score[i]);
            }
        }
        return ans;
    }
}