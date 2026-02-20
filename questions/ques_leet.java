class Solution {
    public int countSquares(int[][] matrix) {
        int count=0,total=0; byte numrows=0,numcols=0;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<m-1;j++)
            {
                if(matrix[i][j]==1 && matrix[i+1][j]==1)
                numrows++;
                if(matrix[i][j]==1 && matrix[i][j+1]==1)
                numcols++;
                if(matrix[i][j]==1 && numrows==numcols)
                {
                    count++; 
                    total+=count;
                }
                else if(matrix[i][j]==1 && numrows!=numcols)
                {
                    count++;
                    total+=count;
                }
                else 
                    count=0;
            } 
        }
        return total;
    }
}
public class ques_leet {
    public static void main(String[] args) {
        Solution_ ans = new Solution_();
        int[][] myArray = 
            {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0 ,1, 1, 1}
            };
        int a = ans.countSquares(myArray);
        System.out.println(a);
    }
}
