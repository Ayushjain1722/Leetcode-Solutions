class sortByCoordinate implements Comparator<int[]>{
    public int compare(int arr1[], int arr2[]){
        if(arr1[0]==arr2[0]) {
            if(arr1[1] <= arr2[1])  return -1;
            else return 1;
        }  else{
            if(arr1[0] <= arr2[0])  return -1;
            else return 1;
        } 
            
    }
}
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new sortByCoordinate());
        int arrows = 1;
        int lastProcessedCoordinate = points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0] <= lastProcessedCoordinate){
                lastProcessedCoordinate = Math.min(lastProcessedCoordinate, 
                                                   points[i][1]);
            }else{
                arrows++;
                lastProcessedCoordinate = points[i][1];
            }
            
        }
        return arrows;
    }
}