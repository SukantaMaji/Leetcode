
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Calculate Length of A list
        int lenA = 0;
        ListNode tempA = headA;
        while(tempA!=null){
            tempA = tempA.next;
            lenA++;
        }

        // Calculate Length of B list
        int lenB = 0;
        ListNode tempB = headB;
        while(tempB!=null){
            tempB = tempB.next;
            lenB++;
        }

        // Reinitialize tempA and tempB to headA and headB respectively
        tempA = headA;
        tempB = headB;

        // Now find difference between two Nodes
        //if lenA > lenB then move forward tempA
        if(lenA > lenB){
            for(int i=1; i<=lenA-lenB; i++){
                tempA = tempA.next;
            }
        }
        //if lenB > lenA then move  forward tempB
        else{
            for(int i=1; i<=lenB-lenA; i++){
                tempB = tempB.next;
            }
        }

        // Move together tempA and tempB until Both the Nodes are equal
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        // return tempA or tempB
        return tempA;


    }
}