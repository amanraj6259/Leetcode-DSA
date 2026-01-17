class Solution {
    public class Pair{
        int x;
        int y;
        Pair(int x, int y)
        {
            this.x= x;
            this.y=y;
        }

    }
    public void setZeroes(int[][] matrix) {
        Queue<Pair>q =new LinkedList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    q.add(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty())
        {
           Pair p = q.poll();
           System.out.println(p.x+ " "+p.y);
            int x=p.x;
            int y= p.y;
        
            int ind= x-1;
            while(ind>=0)
            {
                matrix[ind][y]=0;
                ind--;
            }
            ind=x+1;
            while(ind<n)
            {
                matrix[ind][y]=0;
                ind++;
            }
            ind =y-1;
            while(ind>=0)
            {
                matrix[x][ind]=0;
                ind--;
            }
            ind=y+1;
            while(ind<m)
            {
                matrix[x][ind]=0;
                ind++;
            }
        }
        
        
    }
}