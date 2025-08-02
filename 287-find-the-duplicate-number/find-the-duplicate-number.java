class Solution {
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // Cycle sort. But the array is modyfied
    public int findDuplicate(int[] nums) {
        while(true){
            int ele = nums[0];
            if(nums[ele] == ele) return ele;
            swap(0, ele, nums);
        }
    }
}