class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); 
        
        if(nums.length == 0 || nums == null) return ans; 
        
        List<Integer> runner = new ArrayList<Integer>(); 
        
        helper(ans, runner, 0, nums);
        
        return ans; 
    }
    public void helper(List<List<Integer>> ans, List<Integer> runner, int index, int[] nums){
        ans.add(new ArrayList<>(runner));
        
        for (int i = index; i < nums.length; i ++){
            runner.add(nums[i]); 
            helper(ans, runner, i + 1, nums); 
            runner.remove(runner.size() -1 ); 
        }
    }
}

