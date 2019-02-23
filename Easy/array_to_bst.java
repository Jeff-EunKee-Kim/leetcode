/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null) return null;

        return maker(nums, 0, nums.length -1);

    }
    public TreeNode maker(int [] nums, int left, int right){
        if(left > right) return null;
        int mid = left + (right- left)/2 ;
        TreeNode ans = new TreeNode (nums[mid]);  
        ans.left = maker(nums, left, mid-1);
        ans.right = maker(nums, mid+1, right);
        return ans;
    }

}