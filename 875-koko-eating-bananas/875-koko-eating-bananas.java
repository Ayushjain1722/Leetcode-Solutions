class Solution {
    public int maximum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
            max = Math.max(max,arr[i]);
        return max;
    }
    public boolean check(int arr[],int hrs,int H){
        int hours = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%hrs==0){
                hours += arr[i]/hrs;
            }else{
                hours += arr[i]/hrs + 1;   
            }
            if(hours > H)
                return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int H) {
        //If length of piles is greater than H, then minimum speed should be maximum pile no
        if(piles.length>=H)
            return maximum(piles);
        if(piles.length==1){
            if(piles[0] < H)
                return 1;
            else
                return (int)Math.ceil(1.0*piles[0]/H);
        }
        //Otherwise we can divide the distribution
        Arrays.sort(piles);
        int s = 1;
        int e = piles[piles.length-1];
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(check(piles,mid,H)){
                // System.out.println(ans);
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
}