class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int idx = 1, minD = Integer.MAX_VALUE, maxD = 0, first = -1, last = -1;
        while(right != null){
            if(mid.val<left.val && mid.val<right.val || mid.val>left.val && mid.val>right.val){
                if(first==-1) first = idx;
                if(last != -1){
                    int dist = idx - last;
                    // Min Dist. between two Critical points
                    minD = Math.min(minD, dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        // If there was not a Critical Point
        if(first == last) return ans;
        // Max Dist. between two Critical points
        maxD = last - first;
        ans[0] = minD;
        ans[1] = maxD;
        return ans;
    }
}