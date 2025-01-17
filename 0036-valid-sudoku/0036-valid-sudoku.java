class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
            char curr=board[i][j];
            if(curr!='.'){
                String rowKey="row"+i+curr;
                String colKey="col"+j+curr;
                String boxKey="box"+(i/3)+(j/3)+curr;

                if(s.contains(rowKey) || s.contains(colKey) || s.contains(boxKey)){
                    return false;
                }

                s.add(rowKey);
                s.add(colKey);
                s.add(boxKey);
            }
           }
        }
        return true;
    }
}