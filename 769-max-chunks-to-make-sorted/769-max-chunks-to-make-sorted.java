/*
Solution Intuition: See till which index can the current element impact. So, for 2, 0, 1, the element at index 0 impacts till the second index, element index could have impacted till 0, so it has no impact, element at index 2 impact till index 1 and it also has not impact. So it will be one chunk. 
*/
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int chunks = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
            if(max==i){
                chunks++;
            }
        }
        return chunks;
    }
}