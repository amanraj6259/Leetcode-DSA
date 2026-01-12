class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        queue<pair<int, int>> q;
        int m = matrix.size();
        int n = matrix[0].size();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    q.push({i,j});
                }
            }
        }
        while(!q.empty())
        {
            int x=q.front().first;
            int y=q.front().second;
            q.pop();

            int ind = x-1;
            while(ind>=0)
            {
                matrix[ind][y]=0;
                ind--;
            }
            ind= x+1;
            while(ind<=m-1)
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
            ind= y+1;
            while(ind<=n-1)
            {
                matrix[x][ind]=0;
                ind++;
            }
        }
    }
};