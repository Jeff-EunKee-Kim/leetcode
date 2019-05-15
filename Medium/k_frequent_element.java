class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            map.getOrDefault(nums[i]+1, 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(); 
        for(int key : map.keySet){
            queue.add(map.get(key)); 
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(k > 0){
            ans.add(queue.poll);
            k--;
        }
        return ans;
    }
}