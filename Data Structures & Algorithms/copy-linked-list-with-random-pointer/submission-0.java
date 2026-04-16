/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node current=head;
        Map<Node,Node> hm= new HashMap<>();
        while(current!=null){
            hm.put(current,new Node(current.val));
            current=current.next;
        }
        current=head;
        while(current!=null){
            Node copy=hm.get(current);
            copy.random=hm.get(current.random);
            copy.next=hm.get(current.next);
            current=current.next;
        }
        return hm.get(head);
    }
}
