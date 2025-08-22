class Solution {
    public int countOdds(int low, int high) {
        int tno = (high-low)/2; // Total number of ODD between high and low.
        // if low or high also ODD then plus one to tno.
        if(low%2 != 0 || high%2 != 0) tno++;
        return tno;
    }
}