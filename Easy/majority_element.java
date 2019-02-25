class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1 ) return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        int lim = n/2; 

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1); 
            if(map.get(i) > lim) return i ;
        }
        return 0;

    }
}