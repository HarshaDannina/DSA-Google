class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int i:nums){
            if(store.contains(i)){
                return true;
            }
            store.add(i);
        }
        return false;
    }
}