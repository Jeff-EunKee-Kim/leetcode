class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> perm = new ArrayList<>();
        if(nums.length == 0) return perm; 
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        
        helper(perm, list, used, nums);
        
        return perm; 
    }
    public void helper(List<List<Integer>> perm, List<Integer> list, boolean[] used, int[] nums){
        if(list.size() == nums.length){
            perm.add(new ArrayList<Integer>(list)); 
            return;
        }else{
            for (int i = 0; i< nums.length; i ++){
                if(used[i] || i> 0 && nums[i] == nums[i-1] && used[i-1]) continue; 
                used[i] = true;
                list.add(nums[i]);
                helper(perm, list, used, nums); 
                list.remove(list.size() - 1);
                used[i] = false; 
            }
        }
    }
}