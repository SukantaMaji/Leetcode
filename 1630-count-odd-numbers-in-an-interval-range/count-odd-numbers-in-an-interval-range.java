class Solution {
    public int countOdds(int low, int high) {
        int tne = (high-low)/2;
        if(low%2 != 0 || high%2 != 0) tne++;
        return tne;
    }
}