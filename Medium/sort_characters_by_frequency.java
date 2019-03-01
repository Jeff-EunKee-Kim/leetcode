class Solution {
    public String frequencySort(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>(); 
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }
        
        char[] ans = new char[s.length()]; 
          
        PriorityQueue<Character> queue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        int count = 0; 
        queue.addAll(map.keySet());
        while(!queue.isEmpty()){
            int temp = count; 
            char key = queue.remove(); 
            while( count < temp + map.get(key)){
                for(int j = 0; j<map.get(key); j++){
                    ans[count++] = key; 
                }
            }
        }
        
        return new String(ans); 
    }
    
}