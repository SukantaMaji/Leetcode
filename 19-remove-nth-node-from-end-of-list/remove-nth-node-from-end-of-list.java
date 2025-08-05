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
        // Optimal --> Using fast & Slow pointer
        ListNode slow = head;
        ListNode fast = head;
        // Move ahead fast pointer upto n
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        // if fast == null means we have to dlt head
        // dlt head formula head = head.next
        if(fast == null) return head.next;
        // slow & fasr goes together
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }
}