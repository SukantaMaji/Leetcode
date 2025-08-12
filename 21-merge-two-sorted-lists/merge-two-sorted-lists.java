class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a new node dummy.
        // the value of the node can anything -1/100/90/0/1.....
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode ta = list1;
        ListNode tb = list2;
        while(ta!=null && tb!=null){
            if(ta.val < tb.val){
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
        if(tb==null) temp.next = ta;
        // dummy.next is my current head node for the sorted list.
        return dummy.next;
    }
}