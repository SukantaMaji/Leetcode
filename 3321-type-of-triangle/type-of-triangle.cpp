class Solution {
public:
    string triangleType(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int s = 0, e = nums.size()-1;
        if(nums[s] + nums[s+1] <= nums[e]) return "none";

        unordered_set<int> set(nums.begin(), nums.end());

        if(set.size() == 1) return "equilateral";
        if(set.size() == 2) return "isosceles";
        if(set.size() == 3) return "scalene";
        return "none";
    }
};