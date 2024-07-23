class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int k = 0;
        int[] ans = new int[set2.size()];
        
        for(Integer i : set2){
            ans[k++] = i;
        }
        return ans;
    }
}