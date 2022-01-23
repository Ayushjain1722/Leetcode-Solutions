class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length) return mat;
        int newMatrix[][] = new int[r][c];
        int row = 0;
        int col = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                newMatrix[row][col] = mat[i][j];
                if(col==c-1){
                    col = 0;
                    row++;
                }else{
                    col++;
                }
            }
        }
        return newMatrix;
    }
}