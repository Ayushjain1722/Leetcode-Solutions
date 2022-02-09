class Solution {
    public int findPairs(int[] nums, int k) 
    {
        if(nums.length<1)
            return 0;
        int ans = 0;
        if(k==0)
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                if(map.containsKey(nums[i]))
                    map.put(nums[i],map.get(nums[i])+1);
                else
                    map.put(nums[i],1);
            }
            for(int i=0;i<nums.length;i++)
                if(map.containsKey(nums[i]) && map.get(nums[i])>1){
                    ans++;
                    map.remove(nums[i]);
                }
            return ans;
        }
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.contains(nums[i]))
                map.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int left = nums[i] - k;
            int right = nums[i] + k;
            if(map.contains(nums[i]) && map.contains(left))   ans++;
            if(map.contains(nums[i]) && map.contains(right)) ans++;
            map.remove(nums[i]);
        }
        return ans;
        
    }
}