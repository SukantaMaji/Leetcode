class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> set = new HashSet<>();

        // Separate Friends on basis of their known languages
        for(int[] f: friendships) {
            int u = f[0] - 1; // -1 for match 0 base indexing
            int[] l1 = languages[u];
            int v = f[1] - 1;
            int[] l2 = languages[v];

            // Friends they are not able to communicate store into a Set
            if (!canCommunicate(l1, l2)) {
                set.add(u);
                set.add(v);
            }
        }

        // Teach languages to user  
        int result = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            int count = 0;
            
            for(int user: set){
                if(!isKnown(languages[user], i)){
                    count += 1;
                }
            }
            result = Math.min(result, count);
            
        }
        // If result still Integer.MAX_VALUE then return 0 otherwise return result      
        return result == Integer.MAX_VALUE ? 0 : result;
    }
    public boolean isKnown(int[] languages, int lang){
        for(int a: languages){
            if(a == lang) return true;
        }
        return false;
    }
    public boolean canCommunicate(int[] l1, int[] l2){
        for(int a: l1){
            for(int b: l2){
                if(a == b) return true;
            }
        }
        return false;
    }
}