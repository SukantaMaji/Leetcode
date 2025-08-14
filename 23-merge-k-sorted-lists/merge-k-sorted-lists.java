class Solution {
    // Merging
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode ta = l1;
        ListNode tb = l2;
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
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        // Brute Force
        if(lists.length == 0) return null;
        ListNode head = lists[0];
        for(int i=1; i<lists.length; i++){
            head = merge(head, lists[i]);
        }
        return head;
    }
}