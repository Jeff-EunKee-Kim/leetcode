class Solution {
    // Much faster
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums){
            sum += i; 
        }
        int comp = nums.length * (nums.length + 1) /2 ; 
        return comp - sum; 
    }
    
    // public int missingNumber(int[] nums) {
    //     Arrays.sort(nums); 
    //     for(int i = 0; i< nums.length; i ++){
    //         if (nums[i] != i) return i; 
    //     }
    //     return nums.length; 
    // }
    
    
}