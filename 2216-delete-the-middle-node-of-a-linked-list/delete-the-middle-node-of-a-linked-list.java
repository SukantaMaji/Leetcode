class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // edge case 
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        // Find middle of the LL
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reinitialize fast
        fast = head;
        // Move fast to the previous node of the middle node currently where slow present
        while(fast.next!=slow) fast = fast.next;
        // Delete the middle node
        fast.next = fast.next.next;
        return head;
    }
}