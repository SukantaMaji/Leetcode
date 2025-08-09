public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode slow = head; 
       ListNode fast = head; 
       while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        // if fast reaches null or fast.next reaches null means there is not cycle
        return false;

    }
}