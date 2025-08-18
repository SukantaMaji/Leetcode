class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(-1); // Dummy Node
      ListNode temp = dummy;
      int carry = 0;
      while(l1!=null || l2!=null){
        int val1 = 0, val2 = 0;
        if(l1!=null) val1 = l1.val;
        if(l2!=null) val2 = l2.val;

        // Calculate sum
        int sum = carry + val1 + val2;

        // Get last digit(Unit digit) of sum
        ListNode newnode = new ListNode(sum%10); 

        // Make Connection
        temp.next = newnode;
        temp = temp.next;

        // Store 1st digit of sum into carry(if greater than 9)
        // if(sum > 9) carry = 1;
        // else carry = 0;
        carry = sum / 10;
          

        if(l1!=null) l1 = l1.next;
        if(l2!=null) l2 = l2.next;

      }
      // Handle carry if carry still > 0
      if(carry > 0){
        ListNode newnode = new ListNode(carry);
        temp.next = newnode;
        temp = temp.next;
      }
      return dummy.next; 

    }
}