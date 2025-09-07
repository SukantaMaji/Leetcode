class Solution {
    public int countPalindromicSubsequence(String s) {
        /* Create Two maps One stores Unique indices of character
         and Another stores override indices */
        Map<Character, Integer> firstmap = new HashMap<>();
        Map<Character, Integer> lastmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!firstmap.containsKey(ch)) firstmap.put(ch, i); // Stores Unique indices
            lastmap.put(ch, i); // Stores Override indices
        }

        int count = 0;        
        for(char ch: firstmap.keySet()){
            int firstIdx = firstmap.get(ch);
            int lastIdx = lastmap.get(ch);
            Set<Character> set = new HashSet<>();
            for(int i=firstIdx+1; i<=lastIdx-1; i++){
                set.add(s.charAt(i));
            }
            count += set.size();
        }
        return count;
    }
}