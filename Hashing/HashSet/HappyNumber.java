class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n!=1){
            n = sumOfSquares(n);
            if(set.contains(n)){
                return false;
            } else {
                set.add(n);
            }
        }
        
        if(n==1)
            return true;
        else
            return false;
    }
    
    private int sumOfSquares(int n){
        int ans = 0;
        while(n>0){
            int tmp = n%10;
            ans = ans + (tmp*tmp);
            n = n/10;
        }
        return ans;
    }
}