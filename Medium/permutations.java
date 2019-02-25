class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 0) return ans; 
        List<Integer> permutation = new ArrayList<>();
        helper(ans, permutation, nums);

        return ans; 
    }
    public void helper(List<List<Integer>> list , List<Integer> permutation, int[] nums){
        if(permutation.size() == nums.length) {
            list.add(new ArrayList<>(permutation));
            return ;
        }else{
            for(int i = 0; i < nums.length; i++){
                if(permutation.contains(nums[i])) continue; 
                permutation.add(nums[i]); 
                helper(list, permutation, nums); 
                permutation.remove(permutation.size() - 1);

            }
        }
    }
}