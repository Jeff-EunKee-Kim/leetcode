class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> withoutDup = new HashSet<Integer>(); 
        for(int i : nums){
            withoutDup.add(i);
        }
        for(int i = 1; i <= nums.length; i ++){
            if(!withoutDup.contains(i)) ans.add(i);
        }
        return ans; 
    }
}