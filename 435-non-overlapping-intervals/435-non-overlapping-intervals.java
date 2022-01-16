class sortByLast implements Comparator<int[]>{
    public int compare(int arr1[], int arr2[]){
        if(arr1[1]==arr2[1])
            return arr1[0]-arr2[0];
        return arr1[1] - arr2[1];
    }
}
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new sortByLast());
        int removals = 0;
        int prev[] = intervals[0];
        for(int i=1;i<intervals.length;i++){
            int curr[] = intervals[i];
            if(curr[0] < prev[1]){
                removals++;
                // if(curr[0] >= prev[0] && curr[1] <= prev[1]){
                //     prev = curr;
                // }
            }else{
                prev[0] = curr[0];
                prev[1] = curr[1];
            }
        }
        return removals;
    }
}