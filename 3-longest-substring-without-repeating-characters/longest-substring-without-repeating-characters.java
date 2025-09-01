class Solution {
        public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int maxlen = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch) >= i){
                int len = j-i;
                maxlen = Math.max(maxlen, len);
                while(s.charAt(i) != ch) i++;
                i++;
            }
            map.put(ch, j);
            j++;
        }
        int len = j-i;
        maxlen = Math.max(maxlen, len);
        return maxlen;
    }
}