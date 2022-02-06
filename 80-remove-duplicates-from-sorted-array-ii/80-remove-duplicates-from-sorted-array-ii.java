class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length<=0)
            return 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int count = 1;
            int j = i+1;
            while(j<n && nums[j]==nums[i])
            {
                j++;
                count++;
            }
            
            if(count > 2)
            {
                int x = i+2;
                for(int k=j;k<n;k++)
                {
                    nums[x++] = nums[k];
                }
                n = n - (count-2);
            }
        }
        return n;
    }
}