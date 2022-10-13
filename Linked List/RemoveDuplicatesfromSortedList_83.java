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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode tempHead=head;
        while(tempHead!=null && tempHead.next!=null){
            if(tempHead.val!=tempHead.next.val){
                tempHead=tempHead.next;continue;
            }
            tempHead.next=tempHead.next.next;  
        }
        return head;
    }
}