class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(bucket[entry.getValue()]==null)
                bucket[entry.getValue()] = new ArrayList<>();
            bucket[entry.getValue()].add(entry.getKey());
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i= nums.length; i>=0; i--){
            if(bucket[i]!=null){
                for(int num: bucket[i]){
                    if(idx==k)
                        return ans;
                    ans[idx++] = num;
                }
            }
        }
        return ans;
        
    }
}