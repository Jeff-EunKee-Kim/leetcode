class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(Character.isUpperCase(word.charAt(0))){
            int count = 1;
            for(int i = 1; i< word.length(); i ++){
                if(Character.isUpperCase(word.charAt(i))){
                    count++;
                }
            }
            if(count == 1 || count == word.length()){
                return true; 
            } else{
                return false; 
            }
        } else{
            for(int i = 1; i< word.length(); i ++){
                if(!Character.isLowerCase(word.charAt(i))) return false; 
            }
        }
        return true; 
    }
}