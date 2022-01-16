class Solution {
    public int maxDistToClosest(int[] seats) {
        int prev[] = new int[seats.length];
        int post[] = new int[seats.length];
        int pre = Integer.MAX_VALUE;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1) pre = i;
            prev[i] = pre;
        }
        
        int last = Integer.MAX_VALUE;
        for(int i=seats.length-1;i>=0;i--){
            if(seats[i]==1) last = i;
            post[i] = last;
        }
        int minDistance = Integer.MIN_VALUE;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1) continue;
            int leftLook = prev[i]==Integer.MAX_VALUE?Integer.MAX_VALUE:Math.abs(prev[i]-i);
            int rightLook = post[i]==Integer.MAX_VALUE?Integer.MAX_VALUE:Math.abs(post[i]-i);
            minDistance = Math.max(minDistance, Math.min(leftLook, rightLook));
        }
        return minDistance;
    }
}