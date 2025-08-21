class Solution {
    public int length(ListNode head){
        int n = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        return n;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int size = length(head);
        ListNode temp = head;
        int avg = size/k;
        int extras = size%k;
        for(int i=0; i<k; i++){
            if(temp==null) break;
            ListNode newhead = temp;
            ListNode prev = null;
            int len = 0;
            while(temp!=null && len<avg){
                prev = temp;
                temp = temp.next;
                len++;
            }
            if(extras>0){
                prev = temp;
                temp = temp.next;
                extras--;
            }
            prev.next = null;
            ans[i] = newhead;
        }
        return ans;

    }
}