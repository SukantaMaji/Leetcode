class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxWater = 0;
        int l = 0, r = height.size()-1;
        while(l < r){
            int width = r - l;
            int ht = min(height[r], height[l]);
            int area = ht * width;
            maxWater = max(maxWater, area);

            height[l] < height[r] ? l++ : r--;
        }
        return maxWater;
    }
};