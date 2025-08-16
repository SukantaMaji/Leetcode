class Solution {
    public ListNode oddEvenList(ListNode head) {
        // Create two Dummy Nodes
        ListNode odd = new ListNode(1);
        ListNode even = new ListNode(2);
        ListNode tempo = odd;
        ListNode tempe = even;
        ListNode temp = head;
        while(temp!=null){
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;

            tempe.next = temp;
            if(temp==null) break;
            temp = temp.next;
            tempe = tempe.next;
        }
        tempo.next = even.next;
        return odd.next;
    }
}