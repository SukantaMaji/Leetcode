class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int minr = 0, maxr = n-1, minc = 0, maxc = n-1;
        int val = 1;
        while(minr<=maxr && minc<=maxc){
            // Fill up the first row(left->right) col. varies
            for(int j=minc; j<=maxc; j++){
                ans[minr][j] = val;
                val++;
            } minr++;
            // Fill up the last col(up->down) row varies
            for(int i=minr; i<=maxr; i++){
                ans[i][maxc] = val;
                val++;
            } maxc--;

            // check
            if(minr>maxr && minc>maxc) break;
            // Fill up the last row(right->left) col. varies
            for(int j=maxc; j>=minc; j--){
                ans[maxr][j] = val;
                val++;
            } maxr--;

            // check
            if(minr>maxr && minc>maxc) break;
            // Fill up the first col.(down->up) row varies
            for(int i=maxr; i>=minr; i--){
                ans[i][minc] = val;
                val++;
            } minc++;

        }
        return ans;
    }
}