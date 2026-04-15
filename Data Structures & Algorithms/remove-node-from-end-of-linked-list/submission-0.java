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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int k=size(head);
        if (n == k) {
            return head.next;
        }
        ListNode dummy=head;
       for(int i=0;i<k-n-1;i++){
        dummy=dummy.next;
       }
        
        dummy.next=dummy.next.next;
        return head;
    }

    int size(ListNode head){
      int count=1;
        while(head.next!=null){
         count++;
         head=head.next;
        }
        return count;
    }
}
