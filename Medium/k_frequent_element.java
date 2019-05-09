class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            map.getOrDefault(nums[i]+1, 1);
        }
        int ans = new int[k];
        int count = 0;
        while (k > 0){
            
        }
    }
}