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

// Recurse with memoization
// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         if ( s == null) return true; 
//         HashSet<Integer> memo = new HashSet<>(); 
//         return helper(s, 0, wordDict, memo); 
//     }
//     public boolean helper (String s, int index, List<String> wordDict, Set<Integer> memo){
//         if (index == s.length()) return true; 
//         if(memo.contains(index)) return false; 
//         for (int i = index; i< s.length(); i++){
//             if(wordDict.contains(s.substring(index,i+1))){
//                 if(helper(s, i+1, wordDict, memo)){
//                     return true;
//                 }else{
//                     memo.add(i);
//                 }
//             } 
//         }
//         return false; 

//     }
// }

// Recursive with Memoization
// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         if(s == null || s.equals("")){
//             return true; 
//         }
//         HashSet<Integer> memo = new HashSet<>();         
//         return canBreak(s, 0, wordDict, memo); 
//     }
//     public boolean canBreak(String s, int index, List<String> wordDict, HashSet<Integer> memo){
//         if (index == s.length()) return true; 
//         if(memo.contains(index)) return false; 
//         for(int i = index; i < s.length(); i ++){
//             if(wordDict.contains(s.substring(index, i + 1)) && canBreak(s, i+1, wordDict, memo)){
//                 return true; 
//             }else{
//                 memo.add(index);
//             }
//         }
//         return false; 
//     }
// }

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