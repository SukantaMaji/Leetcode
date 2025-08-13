class Solution {
    // Merge
    public ListNode merge(ListNode list1, ListNode list2){
        // Create a new node dummy.
        // the value of the node can anything -1/100/90/0/1.....
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode ta = list1;
        ListNode tb = list2;
        while(ta!=null && tb!=null){
            if(ta.val <= tb.val){
                temp.next = ta;
                ta = ta.next;
            }
            else{
                temp.next = tb;
                tb = tb.next;
            }
            temp = temp.next;
        }
        if(ta==null) temp.next = tb;
        else temp.next = ta;
        // dummy.next is my current head node for the sorted list.
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode firsthalf = head;
        ListNode slow = head;
        ListNode fast = head;
        // For finding left middle of the LL
        // for odd length list we have to stop when fast.next==null
        // for even length list we have to stop when fast.next.next==null
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhalf = slow.next;
        slow.next = null;
        // Recursively sort two lists.
        firsthalf = sortList(firsthalf);
        secondhalf = sortList(secondhalf);
        // Merging
        ListNode ans = merge(firsthalf, secondhalf);
        return ans;
    }
}