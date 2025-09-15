class Solution 
{
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        Set<Character> set = new HashSet<>();
        for(char ch: brokenLetters.toCharArray())
        {
            set.add(ch);
        }
        
        boolean flag = true;
        int cnt = 0, ptr = 0;
        for(char ch: text.toCharArray())
        {
            ptr++;
            if(set.contains(ch)) 
            {
                flag = false;                
            }
            if(ch == ' '){
                if(flag == false) flag = true;
                else cnt++;               
                
            }
            
            if(ptr == text.length() && flag == true) {
                cnt++;
                break;
            }
                        
        }
        return cnt;
    }
}