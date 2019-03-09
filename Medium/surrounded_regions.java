// Make all the ones within the border into a temporary value, 
// so that I swap all the Os into Xs except the temporary ones

class Solution {
    public void solve(char[][] board) {
       if(board.length == 0) return ; 
        
        for(int i = 0; i < board[0].length; i++){
            if(board[0][i] == 'O') {
                helper(board, 0, i); 
            }
            if(board[board.length-1][i] == 'O') {
                helper(board, board.length-1, i);
            }
        }
        for(int j = 0; j< board.length; j++){
            if(board[j][0] == 'O') {
                helper(board, j, 0); 
            }
            if(board[j][board[0].length-1] == 'O') {
                helper(board, j, board[0].length-1);
            }
        }
        
        for(int i = 0; i< board.length; i ++){
            for(int j = 0; j< board[0].length; j ++){
                if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                
                if (board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
            }
        }
        
    }
    
    public void helper(char[][] board, int row, int col){
        if(row < 0 || row >= board.length || 
           col < 0 || col >= board[0].length || 
           board[row][col] == 'X' || board[row][col] == 'T'){
            return ; 
        }
        
        board[row][col] = 'T';
        helper(board, row + 1, col);
        helper(board, row - 1, col);
        helper(board, row, col + 1);
        helper(board, row, col - 1);
        return; 
    }
}