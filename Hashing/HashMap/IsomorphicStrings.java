class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> store = new HashMap<>();
        HashSet<Character> unique = new HashSet<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(store.get(s.charAt(i))!=null) {
                if(store.get(s.charAt(i))!=t.charAt(i))
                    return false;
                else
                    continue;
            } 
            if(unique.contains(t.charAt(i))){
                return false;
            }
            store.put(s.charAt(i), t.charAt(i));
            unique.add(t.charAt(i));
        }
        return true;
    }
}