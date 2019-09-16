package com.company;

public class Solution63_UniquePathsII {
    public static void main(String[] args) {

    }
    //time:     O(mn)
    //space:    O(mn)
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if (obstacleGrid[0][0]==1) return 0;
        dp[0][0]=1;
        for (int i=1;i<m;i++){
            if (obstacleGrid[i][0]==1) break;
                dp[i][0]=1;
        }
        for (int i=1;i<n;i++){
            if (obstacleGrid[0][i]==1) break;
                dp[0][i]=1;
        }
        for (int i=1;i<m;++i){
            for (int j=1;j<n;++j){
                if (obstacleGrid[i][j]!=1){
                    if (obstacleGrid[i-1][j]==1)
                        dp[i][j] = dp[i][j-1];
                    else if (obstacleGrid[i][j-1]==1)
                        dp[i][j] = dp[i-1][j];
                    else
                        dp[i][j] =dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

}
