class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : nums1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i : nums2){
            if(map.getOrDefault(i,0)>0){
                ans.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        return ans.stream().mapToInt(k -> k).toArray();
    }
}