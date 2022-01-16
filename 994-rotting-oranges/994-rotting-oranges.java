class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();  
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i, j));
                }
            }
        }
        boolean allEmpty = true;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    allEmpty = false;
                    break;
                }
            }
        }
        if(allEmpty)    return 0;
        int time = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Pair p = q.poll();
                if(p.x-1 >=0 && grid[p.x-1][p.y]==1){
                    q.add(new Pair(p.x-1,p.y));
                    grid[p.x-1][p.y] = 2;
                }
                if(p.x+1 < grid.length && grid[p.x+1][p.y]==1){
                    q.add(new Pair(p.x+1,p.y));
                    grid[p.x+1][p.y] = 2;
                }
                if(p.y-1>=0 && grid[p.x][p.y-1]==1){
                    q.add(new Pair(p.x, p.y-1));
                    grid[p.x][p.y-1] = 2;
                }
                if(p.y+1<grid[0].length && grid[p.x][p.y+1]==1){
                    q.add(new Pair(p.x, p.y+1));
                    grid[p.x][p.y+1] = 2;
                }
            }
            
            time++;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)   return -1;       
            }
        }
        
        return time-1;
    }
}