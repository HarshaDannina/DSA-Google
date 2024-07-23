class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board[0].length;
        int n = board.length;
        // Check rows
        for(int i=0; i<n; i++){
            HashSet<Character> set = new HashSet<>();
            for(char ch : board[i]){
                if(set.contains(ch)){
                    return false;
                } else if(ch!='.'){
                    set.add(ch);
                }
            }
        }
        // Check columns
        for(int i=0; i<m; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<n; j++){
                char ch = board[j][i];
                if(set.contains(ch)){
                    return false;
                } else if(ch!='.'){
                    set.add(ch);
                }
            }
        }
        // Check sub boxes
        for(int k = 0; k<m; k+=3){
            for(int l=0; l<n; l+=3){
                HashSet<Character> set = new HashSet<>();
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        char ch = board[i+l][j+k];
                        if(set.contains(ch)){
                            return false;
                        } else if(ch!='.'){
                            set.add(ch);
                        }
                    }
                }
            }
        }
        
        return true;
    }
}