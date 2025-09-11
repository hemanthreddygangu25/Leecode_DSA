class Solution {
  int max=0;
    public int getMaximumGold(int[][] grid) {
      
      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[0].length;j++)
        {
          findmax(i,j,grid,0);
        }
      }
        return max;
    }
    public void findmax(int i,int j,int[][] grid,int sum)
    {
      if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1 || grid[i][j]==-1 || grid[i][j]==0){
            return;
        }
      int cur=grid[i][j];
      grid[i][j]=0;
      max=Math.max(max,sum+cur);

      findmax(i+1,j,grid,sum+cur);
      findmax(i-1,j,grid,sum+cur);
      findmax(i,j+1,grid,sum+cur);
      findmax(i,j-1,grid,sum+cur);
      grid[i][j]=cur;
    }
}