class Solution {
    public boolean hasAlternatingBits(int n) {
        int bit = n % 2; 
        n >>= 1; 
        while (n >0){
            int curr = n % 2; 
            if(curr == bit){
                return false; 
            }
            bit = curr; 
            n >>= 1; 
        }
        return true;  
    }
}