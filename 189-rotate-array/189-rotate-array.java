class Solution {
    public void reverseArray(int arr[], int s, int e){
        int index = 0;
        for(int i=s;i<=(s+e)/2;i++,index++){
            int temp = arr[i];
            arr[i] = arr[e-index];
            arr[e-index] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k<=0 || nums.length<=1)    return;
        reverseArray(nums, 0, nums.length-1);
        // print(nums);
        reverseArray(nums, 0, k-1);
        // print(nums);
        reverseArray(nums, k, nums.length-1);
        // print(nums);
    }
}