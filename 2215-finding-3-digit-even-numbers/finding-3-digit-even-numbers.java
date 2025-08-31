class Solution {
    public int[] findEvenNumbers(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store Frequency of each element of array.
        for(int ele: arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else{
                map.put(ele, 1);
            }
        }

        // Use Arraylist b/c we don't know the exact number of elements.
        List<Integer> list = new ArrayList<>();

        // Check elements of all 3 digits from 100 to 999.
        for(int i = 100; i < 1000; i+=2){
            int x = i;
            int c = x % 10; x /= 10; // Store last digit
            int b = x % 10; x /= 10; // Store mid digit
            int a = x;               // Store first digit
            if(map.containsKey(a)){
                int aFreq = map.get(a);
                map.put(a, aFreq-1);
                if(aFreq == 1) map.remove(a);
                if(map.containsKey(b)){
                    int bFreq = map.get(b);
                    map.put(b, bFreq-1);
                    if(bFreq == 1) map.remove(b);
                    if(map.containsKey(c)){
                        list.add(i);
                    }
                    map.put(b, bFreq);
                }
                map.put(a, aFreq);
            }
        }
        
        // Convert List to Array.
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length ; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}