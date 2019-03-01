/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null; 
        
        ListNode mid = findmid(head); 
        TreeNode ans = new TreeNode(mid.val);
        
        if(head == mid){
            return ans; 
            
        }
        
        ans.left = sortedListToBST(head);
        ans.right = sortedListToBST(mid.next); 
        
        return ans; 
        
        
    }
    
    public ListNode findmid(ListNode head){
        if (head == null || head.next == null) return head; 
        
        ListNode prev = null; 
        ListNode first = head; 
        ListNode second = head; 
        
        while(second != null && second.next != null){
            prev = first; 
            first = first.next; 
            second = second.next.next; 
        }
        
        if(prev != null){
            prev.next = null; 
        }
        return first; 
    }
}