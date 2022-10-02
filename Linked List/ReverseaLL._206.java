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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, temp = null;
        while(curr != null) {
            temp = curr.next;//Store the new head of the sub-linkedlist
            curr.next = prev;//Reverse happens here
            prev = curr;     //Move curr & prev to the next place
            curr = temp;
        }
        return prev;
    }
}