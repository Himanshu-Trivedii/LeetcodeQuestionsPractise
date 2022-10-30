class Solution {
    int dx[]={1,0,-1,0};
    int dy[]={0,1,0,-1};
    public int shortestPath(int[][] grid, int k) {
        Queue<int[]>q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][][]=new boolean[n][m][k+1];
        q.add(new int[]{0,0,0,0});
        vis[0][0][0]=true;
        int ans=Integer.MAX_VALUE;
        while(q.size()>0){
            int cur[]=q.poll();
            int val=cur[2];
            int k1=cur[3];
            if(cur[0]==n-1 && cur[1]==m-1)
               return val;
          
            for(int i=0;i<4;i++){
                int x=dx[i]+cur[0];
                int y=dy[i]+cur[1];
              if(x>=0 && x<n && y>=0 && y<m){
                  int k2=grid[x][y]+k1;
                  if(k2<=k && vis[x][y][k1]==false){
                      q.add(new int[]{x,y,val+1,k2});
                      vis[x][y][k1]=true;
                  }
              }
            }
        }
        return -1;
        
    }
}