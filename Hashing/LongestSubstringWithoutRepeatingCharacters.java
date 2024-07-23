class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int i=0, j=0;
        int n = arr.length;
        int ans = 0;
        while(i<n && j<n){
            while(set.contains(arr[j])){
                set.remove(arr[i]);
                i++;
            }
            ans = Math.max(ans, j+1-i);
            set.add(arr[j]);
            j++;
        }
        return ans;
    }
}