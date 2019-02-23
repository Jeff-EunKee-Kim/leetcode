class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0; 
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count += isIsland(grid, i , j);
                }
            }
        }    
        return count; 
    }

    public int isIsland(char[][] grid, int row, int col){
        if( row < 0 || col < 0 || 
            row >= grid.length || col >= grid[0].length ||
            grid[row][col] == '0'){
                return 0; 
            }

        grid[row][col] = '0';
        
        isIsland(grid, row + 1, col);
        isIsland(grid, row - 1, col);
        isIsland(grid, row, col + 1);
        isIsland(grid, row, col - 1);
        return 1; 
    }
    
}