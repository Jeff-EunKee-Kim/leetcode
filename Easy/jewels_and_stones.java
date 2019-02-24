class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewels = new HashSet<Character>(); 
        for (char c: J.toCharArray()){
            jewels.add(c); 
        }
        int count = 0; 
        for (char c: S.toCharArray()){
            if(jewels.contains(c)) count++;
        }
        return count; 
    }
}