class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String i : strs){
            String key = hash(i);
            if(map.get(key)!=null){
                map.get(key).add(i);
            } else {
                
                map.put(key, new ArrayList<String>(Arrays.asList(i)));
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    private String hash(String s){
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);
        return String.valueOf(sorted);
    }
}