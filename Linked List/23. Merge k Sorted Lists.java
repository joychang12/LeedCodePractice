/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        Queue<ListNode> heap = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode node : lists){
            if(node == null) continue;
            heap.add(node);
        }

        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while(!heap.isEmpty()){
            ListNode top = heap.poll();
            cur.next = top;
            cur = cur.next;
            if(top.next != null){
                heap.add(top.next);
            }
        }

        return dummy.next;

        
    }
}