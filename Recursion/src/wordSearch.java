public class wordSearch {
    public boolean exists(char[][] board , String word){
        int n = board.length;
        int m = board[0].length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                if(board[i][j] == word.charAt(0)){
                    char prev = board[i][j];
                    board[i][j] = '*';
                    if(dfs(i , j , board , word , 1)) return true;
                    board[i][j] = prev;
                }
            }
        }
        return false;
    }
    int [][] directions = {{0,1} , {0,-1} , {1,0} , {-1,0}};
    public boolean dfs(int x , int y , char[][] board , String word , int index){
        if(index >= word.length()) return true;
        for(int[] dir : directions){
            int newX = x + dir[0];
            int newY = y + dir[1];
            if (!isValid(newX , newY , board)) continue;
            if(board[newX][newY] == '*') continue;
            if(board[newX][newY] == word.charAt(index)) {
                char prev = board[newX][newY];
                board[newX][newY] = '*';
                if (dfs(x, y, board, word, index + 1)) return true;
                board[newX][newY] = prev;
            }
        }
        return false;
    }
    public boolean isValid(int a , int b , char[][] board){
        return (a>0 || b>0 || a<board.length || b<board[0].length);
    }

    public static void main(String[] args) {

    }
}
