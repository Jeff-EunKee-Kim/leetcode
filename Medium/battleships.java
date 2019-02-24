class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;        
        
        for (int i = 0; i< board.length; i ++){
            for(int j = 0; j< board[0].length; j++){
                count += isValid(board, i, j);
            }
        }
        return count; 
    }
    public int isValid(char[][] board, int row, int col){
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length) return 0 ;

        if (board[row][col] == '.') return 0; 
        
        board[row][col] = '.';
        isValid(board, row +1, col); 
        isValid(board, row -1, col); 
        isValid(board, row, col + 1); 
        isValid(board, row, col - 1); 
        return 1; 
    }
}