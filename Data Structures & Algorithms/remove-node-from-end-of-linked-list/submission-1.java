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
    //     int k=size(head);
    //     if (n == k) {
    //         return head.next;
    //     }
    //     ListNode dummy=head;
    //    for(int i=0;i<k-n-1;i++){
    //     dummy=dummy.next;
    //    }
        
    //     dummy.next=dummy.next.next;
    //     return head;
       ListNode dummy = new ListNode(0, head);
       ListNode slow=dummy;
       ListNode fast=head;
       while(n>0){
        fast=fast.next;
        n--;
       }
       while(fast!=null){
        slow=slow.next;
        fast=fast.next;
        

       }
       slow.next=slow.next.next;
       return dummy.next;
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
