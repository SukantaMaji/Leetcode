class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int ele = arr[i]%k;
            if(ele < 0) ele += k; // Handling Negative numbers

            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);                           
        }

        // Handling 0s
        if(map.containsKey(0)){
            if(map.get(0)%2 != 0) return false;
            map.remove(0);
        }
        
        for(int key: map.keySet()){
            int rem = k - key;
            if(!map.containsKey(rem)) return false;
            int remFreq = map.get(rem);
            int keyFreq = map.get(key);
            if(remFreq != keyFreq) return false;
        }
        return true;
    }
}