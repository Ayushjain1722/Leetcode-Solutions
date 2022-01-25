class Solution {
    public boolean validMountainArray(int[] arr) {
         if(arr.length<=1)
            return false;
        boolean isEqual = false;
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i])
                return false;
            if(arr[i-1]<arr[i]){
                if(isDecreasing==true)
                    return false;
                isIncreasing = true;
            }
            if(arr[i-1]>arr[i]){
                if(isIncreasing==false)
                    return false;
                isDecreasing = true;
            }
        }
        if(!isIncreasing || !isDecreasing)
            return false;
        return true;
    }
}