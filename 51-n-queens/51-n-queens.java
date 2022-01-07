class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> answer = new ArrayList<>();
        
        char[][] grid = new char[n][n];
 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                grid[i][j] = '.';
            }
        }
 
        nQueens(grid, 0, n, answer);
        return answer;
    }//solution
 
    private void nQueens(char[][] grid, int currentRow, int n, List<List<String>> answer){
 
        if(currentRow == n){
           List<String> tempAns=populateAns(grid,n);
            answer.add(tempAns);
            return;
        }
 
        for(int currentCol = 0; currentCol < n; currentCol++){
 
            if(isValid(currentRow, currentCol, grid, n)){
                grid[currentRow][currentCol] = 'Q';
                nQueens(grid, currentRow+1, n, answer);
                grid[currentRow][currentCol] = '.';
            }
        } 
        return;    
    }
 
    private List<String> populateAns(char[][] grid, int n){
        List<String> ans = new ArrayList<>();
        for(int currentRow = 0; currentRow < n; currentRow++){
            String temp = "";
            for(int currentCol = 0; currentCol < n; currentCol++){
                temp += grid[currentRow][currentCol];
            }
            ans.add(temp);
        }
 
        return ans;
    }
 
    private boolean isValid(int currentRow, int currentCol, char[][] grid, int n){
        return isRowValid(currentRow, grid, n) && isColValid(currentCol, grid, n) && AreDiagonalsValid(grid, currentRow, currentCol, n);
    }
 
    private boolean isRowValid(int currentRow, char[][] grid, int n){
        for(int j = 0; j < n; j++){
            if(grid[currentRow][j] == 'Q'){
                return false;
            }
        }
 
        return true;
    }
 
    private boolean isColValid(int currentCol, char[][] grid, int n){
        for(int i = 0; i < n; i++){
            if(grid[i][currentCol] == 'Q'){
                return false;
            }
        }
 
        return true;
    }
 
    private boolean AreDiagonalsValid(char[][] grid, int currentRow, int currentCol, int n){
 
        int i = currentRow;
        int j = currentCol;
 
        while(i >= 0 && j >= 0){
            if(grid[i][j] == 'Q'){
                return false;
            }
            i -= 1;
            j -= 1;
        }
 
        i = currentRow;
        j = currentCol;
 
        while(i >= 0 && j < n){
            if(grid[i][j] == 'Q'){
                return false;
            }
            i -= 1;
            j += 1;
        }
 
        i = currentRow;
        j = currentCol;
 
        while(i < n && j < n){
            if(grid[i][j] == 'Q'){
                return false;
            }
            i += 1;
            j += 1;
        }
 
        i = currentRow;
        j = currentCol;
 
        while(i < n && j >= 0){
            if(grid[i][j] == 'Q'){
                return false;
            }
            i += 1;
            j -= 1;
        }
 
        return true;
    }
}