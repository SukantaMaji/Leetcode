class Solution {
public:
    bool rotateString(string s, string goal) {
        for(int i=1; i<=s.length(); i++){
            // Built in rotate method(starting, Where to rotate, ending)
            // If says rotate k places then rotate(begin(s), begin(s)+k, end(s))
            rotate(begin(s), begin(s)+1, end(s));
            if(s == goal) return true;
        }
        return false;
    }
};