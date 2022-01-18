class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)    return true;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1) continue;
            else{
                if(i-1 >=0 && flowerbed[i-1]==1)    continue;
                if(i+1<flowerbed.length && flowerbed[i+1]==1)   continue;
                flowerbed[i] = 1;
                n--;
                if(n==0)    return true;
            }   
        }
        return n==0;
    }
}