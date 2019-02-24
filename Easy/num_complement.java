class Solution {
    public int findComplement(int num) {
        int ans = 0; 
        int bits = 1; 
        while(num > 0){
            ans += (num % 2 ^ 1) * bits; 
            bits *= 2; 
            num /= 2; 
        }
        return ans; 
    }
}