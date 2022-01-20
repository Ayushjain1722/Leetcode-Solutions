class Solution {
    public int hammingDistance(int x, int y) {
        int hammingDist = 0;
        while(x!=0 || y!=0){
            int xBit = x&1;
            int yBit = y&1;
            x>>=1;
            y>>=1;
            // System.out.println(xBit + " " + yBit+" "+x+" "+y);
            if(xBit != yBit){
                hammingDist++;
            }
        }
        return hammingDist;
    }
}