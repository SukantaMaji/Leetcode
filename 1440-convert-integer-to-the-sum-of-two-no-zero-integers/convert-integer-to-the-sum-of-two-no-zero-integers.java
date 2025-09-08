class Solution {
    public int[] getNoZeroIntegers(int n) {
        int ans[] = {-1, -1};
        for(int i=1; i<=n; i++){
            int a = i, b = n-i;
            // Convert int to string to check whether it contains 0 or not
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0") && a + b == n){
                ans[0] = a;
                ans[1] = b;
                return ans;
            }
        }
        return ans;
    }
}