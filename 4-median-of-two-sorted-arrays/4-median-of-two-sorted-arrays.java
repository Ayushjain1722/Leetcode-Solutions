class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int ans = 0;
        int pre = -1;
        int k = (nums1.length+nums2.length)/2 + 1;
        while(i<nums1.length && j<nums2.length && k>0){
            pre = ans;
            if(nums1[i] < nums2[j]){
                ans = nums1[i];
                i++;
                k--;
            }else{
                ans = nums2[j];
                j++;
                k--;
            }
        }
        while(i<nums1.length && k>0){
            pre = ans;
            ans = nums1[i];
            i++;
            k--;
        }
        while(j<nums2.length && k>0){
            pre = ans;
            ans = nums2[j];
            j++;
            k--;
        }
        return (nums1.length+nums2.length)%2==0? ((1.0*ans)+(1.0*pre))/2: 1.0*ans;
    }
}