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
     private static ListNode Reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode prev=null,curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;    
        }
         return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2; if(l2==null)return l1;
        int carry=0;
        ListNode Answer=new ListNode();
        ListNode temp=Answer;
        while(l1!=null ||  l2!=null || carry!=0){
            int sum=0;
            if(l1!=null){
                 sum+=l1.val;l1=l1.next;
            } 
            if(l2!=null){
                sum+=l2.val;l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;temp=temp.next;
        }
        return Answer.next;
    }
}