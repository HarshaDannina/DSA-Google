class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> store = new HashMap<>();
        for(Character ch:s.toCharArray()){
            store.put(ch, store.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(store.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
        
    }
}