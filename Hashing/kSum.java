class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, 4, target);
    }
    private List<List<Integer>> kSum(int[] nums, int low, int k, long target){
        int high = nums.length-1;
        List<List<Integer>> ans = new ArrayList<>();
        if(low>=nums.length){
            return ans;
        }
        long average_val = target/k;
        if(nums[low]>average_val || average_val>nums[high]){
            return ans;
        }
        if(k==2){
            return twoSum(nums, low, target);
        }
        for(int i=low; i<=high; i++){
            if(i==low || nums[i]!=nums[i-1]){
                List<List<Integer>> res = kSum(nums, i+1, k-1, target-nums[i]);
                for(List<Integer> r : res){
                    r.add(nums[i]);
                }
                ans.addAll(res);
            }
        }
        return ans;
    }
    private List<List<Integer>> twoSum(int[] nums, int low, long target){
        List<List<Integer>> res = new ArrayList<>();
        int high = nums.length-1;
        while(low<high){
            if(nums[low]+nums[high]==target){
                res.add(new ArrayList<Integer>(Arrays.asList(nums[low], nums[high])));
                low++; high--;
                while(low<high && nums[low]==nums[low-1]){
                    low++;
                }
                while(low<high && nums[high]==nums[high+1]){
                    high--;
                }
            } else if(nums[low]+nums[high]<target){
                low++;
            } else {
                high--;
            }
        }
        return res;
    }
}