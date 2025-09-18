class Solution {
public:
    string removeOuterParentheses(string s) {
        string ans = "";
        int count = 0;
        for(char ch: s){
            if(ch == ')') count--;
            if(count) ans+=ch; //  if(count != 0)
            if(ch == '(') count++;
        }
        return ans;
    }
};