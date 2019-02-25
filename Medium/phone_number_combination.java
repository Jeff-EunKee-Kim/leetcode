class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>(); 
        if (digits.length() == 0) return combinations; 

        String []mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        perm(combinations, digits, 0, "", mapping);
        return combinations; 
    }
    public void perm(List<String> combinations, String digits, int index, String current, String[] mapping){
        if(index == digits.length()) {
            combinations.add(current); 
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for(int i =0; i < letters.length(); i++){
            perm(combinations, digits, index + 1, current + letters.charAt(i), mapping);
        }
    }
}