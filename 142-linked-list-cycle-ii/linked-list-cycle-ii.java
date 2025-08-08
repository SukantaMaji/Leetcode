
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if there is single node head
        if(head==null || head.next==null) return null;

        // Detecting Cycle algorithm
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) break;
        }

        // After breaking the loop if (fast!=slow) then there is no cycle.
        if(fast!=slow) return null;

        // Use temp pointer to find the Require Node from where cycle is started
        ListNode temp = head;
        while(temp!=slow){
            temp = temp.next;
            slow = slow.next;
        }
        // Return slow or temp b/c both are on same node
        return slow;


    }
}