// Dynamic Programming Solution

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() +1];
        
        dp[0] = true; 
        
        for (int i = 1; i < s.length()+1; i ++){
            for(int j = 0; j<i; j++){
                if(dp[j] && wordDict.contains(s.substring(j, i))){
                
                   dp[i] = true; 
                   break; 
            
                }    
            }
        }
        return dp[s.length()];
    }
}


// Recursive Solution
// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         if (s == null) return true;
        
//         return canBreak(0, s, wordDict);
//     }
//     public boolean canBreak(int idx, String s, List<String> wordDict){
//         if (idx == s.length()) return true; 
        
//         for (int i = idx; i < s.length(); i++){
//             Boolean isWord = wordDict.contains(s.substring(idx, i + 1)); 
            
//             if(isWord && canBreak(i+1, s, wordDict)) return true; 
//         }
//         return false; 
//     }
// }