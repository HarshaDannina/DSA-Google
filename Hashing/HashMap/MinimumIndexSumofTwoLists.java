class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> set1 = new HashMap<>();
        HashMap<String, Integer> set2 = new HashMap<>();
        int leastIndexSum = Integer.MAX_VALUE;
        for(int i=0; i<list1.length; i++){
            set1.put(list1[i], i);
        }
        for(int i=0; i<list2.length; i++){
            if(set1.get(list2[i])!=null){
                leastIndexSum = Math.min(leastIndexSum, i+set1.get(list2[i]));
                set2.put(list2[i], i+set1.get(list2[i]));
            }
        }
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : set2.entrySet()){
            if(entry.getValue()==leastIndexSum){
                ans.add(entry.getKey());
            }
        }
        return ans.stream().toArray(String[]::new);
    }
}