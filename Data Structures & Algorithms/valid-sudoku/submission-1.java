class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m = board[0].length;
        HashSet<String> hs= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(board[i][j]!='.'){
              String rowKey="row in"+ " " + i +" "+ board[i][j];
              String colKey="col in"+ " " + j +" "+ board[i][j];
              String boxKey="box in" + (i/3) + " " +(j/3) +" "+ board[i][j];
              if(hs.contains(rowKey)||hs.contains(colKey)||hs.contains(boxKey)){
                return false;
              }else{
                hs.add(rowKey);
                hs.add(colKey);
                hs.add(boxKey);
              }
               }
            }
        }
        return true;
    }
}
