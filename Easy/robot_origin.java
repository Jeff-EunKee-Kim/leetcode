class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0; 
        for (char c : moves.toCharArray()){
            if (c == 'L') horizontal--;
            else if (c == 'R') horizontal++;
            else if (c == 'U') vertical ++;
            else if (c == 'D') vertical --; 
        }
        return horizontal == 0 && vertical == 0; 
    }
}