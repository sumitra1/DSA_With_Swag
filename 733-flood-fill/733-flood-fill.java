class Solution {
    public int[][] floodFill(int[][] grid, int sr, int sc, int newColor) {
        
        if(grid[sr][sc]==newColor){
            return grid;
        }
        
        sinkGrpah(grid,sr,sc,grid[sr][sc],grid.length,grid[0].length,newColor);
        return grid;
        
    }
    private void sinkGrpah(int[][] grid,int currentRow,int currentCol,int color,int m,int n, int newColor){
        if(currentRow<0 || currentRow>=m || currentCol <0 || currentCol>=n || grid[currentRow][currentCol]!=color){
            return;
        }
        grid[currentRow][currentCol]=newColor;
        
        sinkGrpah(grid,currentRow-1,currentCol,color,m,n,newColor);
        
         sinkGrpah(grid,currentRow+1,currentCol,color,m,n,newColor);
        
         sinkGrpah(grid,currentRow,currentCol-1,color,m,n,newColor);
        
         sinkGrpah(grid,currentRow,currentCol+1,color,m,n,newColor);
        
        return;
    }
}