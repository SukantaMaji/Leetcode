class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int mxS = Integer.MIN_VALUE, cSum = 0;
        for(int i=0; i<n; i++){
            // Kadane's Algo...
            cSum += nums[i];
            if(cSum > mxS) mxS = cSum;
            if(cSum < 0) cSum = 0;
        }
        return mxS;
    }
}