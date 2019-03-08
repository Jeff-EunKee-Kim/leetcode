/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null; 
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode list: lists){
            while(list != null){
                minHeap.add(list.val);
                list = list.next; 
            }
        }
        ListNode ans = new ListNode(0); 
        ListNode dummy = ans; 

        while(!minHeap.isEmpty()){
            dummy.next = new ListNode(minHeap.remove());
            dummy = dummy.next;
        }
        return ans.next; 
    }
}