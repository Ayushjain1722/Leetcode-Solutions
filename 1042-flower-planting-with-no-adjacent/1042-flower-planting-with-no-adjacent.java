class Solution {
    public boolean isValid(List<Integer> graphs[], int color, int src, int colors[]){
        for(int i=0;i<graphs[src].size();i++){
            if(colors[graphs[src].get(i)]==color)
                return false;
        }
        return true;
    }
    public boolean Helper(int paths[][], List<Integer> graph[], int src, int color[]){
        if(src>=color.length)
            return true;
        for(int c=1;c<=4;c++){
            if(isValid(graph, c, src, color)){
                color[src] = c;
                if(Helper(paths, graph, src+1, color))
                    return true;
            }
        }
        return false;
    }
    public int[] gardenNoAdj(int n, int[][] paths) {
        int color[] = new int[n];
        List<Integer> graph[] = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<paths.length;i++){
            graph[paths[i][0]-1].add(paths[i][1]-1);
            graph[paths[i][1]-1].add(paths[i][0]-1);
        }
        Helper(paths, graph, 0, color);
        return color;
    }
}