class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vMap = new HashMap<>();

        for(String word: wordlist){
            String lowerC = word.toLowerCase();
            caseMap.putIfAbsent(lowerC, word);
            vMap.putIfAbsent(asTreic(lowerC), word);
        }

        String[] result = new String[queries.length];
        for(int i=0; i<result.length; i++){
            String queri = queries[i];
            if(exact.contains(queri)) result[i] = queri;
            else{
                String lowerQueri = queri.toLowerCase();
                if(caseMap.containsKey(lowerQueri)) result[i] = caseMap.get(lowerQueri);
                else{
                    String astreic = asTreic(lowerQueri);
                    result[i] = vMap.getOrDefault(astreic, "");
                }
            }
        }
        return result;
    }

    public String asTreic(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                sb.append("*");
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}