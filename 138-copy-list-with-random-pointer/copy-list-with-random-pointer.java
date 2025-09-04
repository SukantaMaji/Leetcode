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
    public Node deepCopy(Node head){
        if(head == null) return null;
        Node h2 = new Node(head.val);
        Node t1 = head.next;
        Node t2 = h2;
        while(t1!=null){
            Node temp = new Node(t1.val);
            t2.next = temp;
            t1 = t1.next;
            t2 = t2.next;
        }
        return h2;
    }
    public Node copyRandomList(Node head) {
        // S-1: Create deepCopy
        Node head2 = deepCopy(head);

        // S-2: Connect alternatively head and head2
        Node dummy = new Node(-1);
        Node t1 = head;
        Node t2 = head2;
        Node temp = dummy;
        while(t1!=null && t2!=null){
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
           
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }

        // S-3: Assign random pointers
        t1 = head; t2 = head2;
        while(t1!=null){ 
            t2 = t1.next;           
            if(t1.random!=null) t2.random = t1.random.next;
            t1 = t1.next.next;
            
        }
        
        // S-4: split the list
        t1 = head;
        t2 = head2;
        while(t1!=null){
            t1.next = t2.next;
            t1 = t1.next;

            if(t1 == null) break;

            t2.next = t1.next;
            t2 = t2.next;
        }
        return head2;

    }
}