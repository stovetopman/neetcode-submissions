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
        PriorityQueue<ListNode> heap = new PriorityQueue<>((n1, n2) -> Integer.compare(n1.val, n2.val));
        for (ListNode head : lists) {
            if (head != null) {
                heap.offer(head);
            }
        }
        ListNode dummy = new ListNode();
        ListNode start = dummy;
        while (!heap.isEmpty()) {
            ListNode temp = heap.poll();
            if (temp.next != null) {
                heap.offer(temp.next);
            }
            dummy.next = temp;
            dummy = dummy.next;
        }
        return start.next;
    }
}
