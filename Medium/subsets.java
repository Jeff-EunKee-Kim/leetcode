class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if (nums.length == 0 || nums == null) return ans; 

        List<Integer> list = new ArrayList<>();
        helper(ans, list, nums, 0); 

        return ans; 
    }
    public void helper(List<List<Integer>> ans, List<Integer> list, int[] nums, int index){
        ans.add(new ArrayList<>(list));
        for(int i = index; i< nums.length; i ++){
            list.add(nums[i]); 
            helper(ans, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
