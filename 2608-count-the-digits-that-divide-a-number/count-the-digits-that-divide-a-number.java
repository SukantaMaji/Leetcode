class Solution {
    public int countDigits(int num) {
       int c_num = num, cnt = 0;
       while(c_num > 0) {
          int val = c_num%10; // Store last digit
          if(num%val==0) cnt++;
          c_num /= 10;
        }
        return cnt;
    }
}