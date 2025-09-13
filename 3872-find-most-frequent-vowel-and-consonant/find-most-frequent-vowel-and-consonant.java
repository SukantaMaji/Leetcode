class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26]; // Frequency array
        // Stores Frequencies
        for(char ch: s.toCharArray()){
            freq[ch - 'a'] += 1;  // JVM automatically convert 'a' to 97      
        }

        int vMax = Integer.MIN_VALUE, cMax = Integer.MIN_VALUE;
        String vowels = "aeiou";
        for(int i=0; i<freq.length; i++){
            char ch = (char)(i + 'a');
            int f = freq[i];

            if(vowels.indexOf(ch) != -1){
                vMax = Math.max(vMax, f);
            }
            else cMax = Math.max(cMax, f);
        }
        return vMax + cMax;
    }
}