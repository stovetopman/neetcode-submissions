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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode results = res;
        while (list1 != null && list2 != null) {
            ListNode temp = new ListNode();
            if (list1.val< list2.val) {
                temp.val = list1.val;
                res.next = temp;
                res = res.next;
                list1 = list1.next;
            } else {
                temp.val = list2.val;
                res.next = temp;
                res = res.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            res.next = list2;
        } else {
            res.next = list1;
        }
        return results.next;
    }
}