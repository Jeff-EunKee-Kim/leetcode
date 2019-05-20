class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int j = 0; j<matrix.length; j ++){
            for (int i = matrix[j].length-2; i>=0; i--){
                int temp = i; 
                int check = matrix[j][temp];
                int row = j; 
                while(row +1 < matrix.length && temp +1< matrix[0].length){
                    row++;
                    temp++;
                    if(check != matrix[row][temp]) return false;
                }
            }
        }
        
        return true;
    }
}