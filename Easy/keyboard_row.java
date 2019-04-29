class Solution {
    public String[] findWords(String[] words) {
        char[] alph = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        int one = 0;
        int two = 0;
        int three = 0;
        ArrayList<String> ans = new ArrayList<>();
        
        for (String word : words){
            
            int temp = alph[Character.toLowerCase(word.charAt(0))-'a'];
            int check = temp; 
            for (int i = 1; i< word.length(); i++){
                if(temp != alph[Character.toLowerCase(word.charAt(i))-'a']){
                    temp = alph[Character.toLowerCase(word.charAt(i))-'a'];
                    break;
                }
                
            }
            if (check == temp) ans.add(word);
        }
        
        return ans.toArray(new String[0]);
    }
}