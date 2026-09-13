class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> frequencyMap = new HashMap<>();

        for(String s : strs){
            int [] count = new int [26];
           for(char c: s.toCharArray()){
                count[c - 'a']++;
           }
            String key = Arrays.toString(count);
            frequencyMap.putIfAbsent(key, new ArrayList<>());
            frequencyMap.get(key).add(s);
        }
        return new ArrayList<>(frequencyMap.values());
    }
}
