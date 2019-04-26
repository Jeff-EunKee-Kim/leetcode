class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> memory = new HashSet<>();
        memory.add(n);
        while (n != 1){
            int digitSquare = 0;
            while(n > 0){
                digitSquare += Math.pow(n%10, 2);
                n /= 10; 
            }
            
            if(memory.contains(digitSquare)) return false;
            memory.add(digitSquare);

            n = digitSquare; 
        }
        return true; 
    }
}