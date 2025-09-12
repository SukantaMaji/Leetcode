class Solution {
    public boolean doesAliceWin(String s) {
        String vowels = "aeiou";
        int vCount = 0;
        // Count Number of Vowels
        for(char ch: s.toCharArray()){
            if(vowels.indexOf(ch) != -1) vCount++;
        }
        return vCount > 0;
    }  
    
}