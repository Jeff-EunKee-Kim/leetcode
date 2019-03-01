class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0; 
        for(int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, area(grid, i, j));
                }
            }
        }
        return max;
    }
    public int area(int[][] grid, int row, int col){
        
        if(row < 0 || col < 0 || row >=grid.length || col >= grid[0].length) return 0;
        if (grid[row][col] == 0) return 0;
        
        grid[row][col] = 0;
        int count = 1 ;
        count += area(grid, row + 1, col); 
        count += area(grid, row - 1, col); 
        count += area(grid, row, col + 1); 
        count += area(grid, row, col - 1); 

        return count; 
        
        
        
        
    }
}