class Solution {
public:
    string largestOddNumber(string num) {
        int n = num.length();
        for(int i=n-1; i>=0; i--){
            // 'char' - '0' = int value of the char
            if((num[i] - '0')%2 != 0){
                // substr(starting index, length)
                return num.substr(0, i+1);
            }
        }
        return "";
    }
};