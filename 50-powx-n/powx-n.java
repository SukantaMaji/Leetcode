class Solution {
    public double myPow(double x, long n) {
        if(n < 0){
            n *= -1;
            x = 1/x;
        }
        if(n == 0) return 1;
        double ans = myPow(x,n/2);
        if(n % 2 == 0) return ans * ans;
        return ans * ans * x;
    }
}