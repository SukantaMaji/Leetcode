class Solution {
public:
    vector<int> replaceNonCoprimes(vector<int>& nums) {
        vector<int> ans;

        for(int num: nums){
            while(!ans.empty()){
                int prev = ans.back();
                int current = num;

                int GCD = gcd(prev, current);
                if(GCD == 1) break;

                ans.pop_back();

                int LCM = prev/GCD * current;
                num = LCM;

            }
            ans.push_back(num);
        }
        return ans;
    }
};