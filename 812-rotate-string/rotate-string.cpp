class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.length() != goal.length()) return false;

        /* If we concatenate a string with itself, then it will
         contain all rotations as a substring.
        */

        if((s+s).find(goal) != string::npos) return true;
        return false;
    }
};