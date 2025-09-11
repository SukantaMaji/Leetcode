class Solution {
    public String sortVowels(String s) {
        String vowels = "AEIOUaeiou";
        int[] freq = new int[128];
        
        // Manage Frequencies
        for(char ch: s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                freq[ch] += 1;
            }
        }
        
        // Store Sorted Vowels into StringBuilder
        StringBuilder SortedSb = new StringBuilder();
        for(int asci = 0; asci < freq.length; asci++){
            while(freq[asci] > 0){
                SortedSb.append((char)asci);
                freq[asci]--;
            }
        }
        
        // Iterate last time to add vowels in sorted orders
        StringBuilder result = new StringBuilder();
        int idx = 0;
        for(char ch: s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                result.append(SortedSb.charAt(idx));
                idx++;
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}