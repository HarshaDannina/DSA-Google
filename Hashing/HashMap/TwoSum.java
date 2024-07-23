class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            if(store.get(target-nums[i])!=null){
                res[0] = store.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            store.put(nums[i], i);
        }
        return res;
        
    }
}