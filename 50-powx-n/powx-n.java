class Solution {
    public double pow(double x, int n){
        if(n == 0) return 1;
        double exp = pow(x, n/2);
        if(n%2==0) return exp * exp;
        return exp * exp * x;
    }
    public double myPow(double x, int n) {
        if(n < 0) return 1/pow(x, (-1)*n);
        return pow(x, n);
    }
}