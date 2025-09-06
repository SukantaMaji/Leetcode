class Solution {
    // Brute Force
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=nums.length-1, cnt = 0;
        while(i < j){
            if(nums[i] + nums[j] == k){
                cnt++;
                i++;
                j--;
            }
            else if(nums[i] + nums[j] < k) i++;
            else j--;
        }
        return cnt;
    }
}