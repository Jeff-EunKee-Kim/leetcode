class Solution {
    public int leastInterval(char[] tasks, int n){
        HashMap<Character, Integer> map = new HashMap<>(); 
        for (char c : tasks){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        q.addAll(map.values());
        
        int ans = 0; 
        while(!q.isEmpty()){
            List<Integer> runner = new ArrayList<>(); 
            for (int i =0; i<n+1; i++){
                if(!q.isEmpty()){
                    runner.add(q.remove());
                }
            }
            for(int i : runner){
                if(--i > 0){
                    q.add(i); 
                }
            }
            ans += q.isEmpty() ? runner.size() : n + 1;
        }
        return ans; 

    }
}