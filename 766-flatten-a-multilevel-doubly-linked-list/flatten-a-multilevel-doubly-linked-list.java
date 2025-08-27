/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
       Node temp = head;
       while(temp!=null){
            Node n = temp.next;
            if(temp.child!=null){
                // Recursively 
                Node c = flatten(temp.child);
                Node d = c; // act like temp for new List
                while(d.next!=null) d = d.next;
                temp.next = c; c.prev = temp;
                // Connects with main list
                d.next = n;
                if(n!=null) n.prev = d; // Check n to avoid runtime error
                temp.child = null;  // set all the childs to null again
            }
            temp = n;
        }
        return head;
    }
}