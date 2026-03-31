class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs= new HashSet<>();
        int m= board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(board[i][j]!='.'){
                    String rowKey= i+"row in"+board[i][j];
                String colKey=j+"col in"+board[i][j];
                String boxKey= (i/3) +","+(j/3)+","+ "box in"+board[i][j];
                if(!hs.add(rowKey)||!hs.add(colKey)||!hs.add(boxKey)){
                    return false;
                }
                }
            }
        }
        return true;
    }
}
