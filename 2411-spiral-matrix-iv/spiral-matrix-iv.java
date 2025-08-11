class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        // Build in method to fill the Array with any element(here -1).
        for(int[] r: ans){
            Arrays.fill(r, -1);
        }
        int minr = 0, maxr = m-1, minc = 0, maxc = n-1;
        while(head!=null){
            // Fill 1st row (Left->Right)
            for(int j=minc; j<=maxc; j++){
                if(head==null) break;
                ans[minr][j] = head.val;
                head = head.next;
            } minr++;
            // Fill last column (Up->Down)
            for(int i=minr; i<=maxr; i++){
                if(head==null) break;
                ans[i][maxc] = head.val;
                head = head.next;
            } maxc--;
            // Fill last row (Rigth->Left)
            for(int j=maxc; j>=minc; j--){
                if(head==null) break;
                ans[maxr][j] = head.val;
                head = head.next;
            } maxr--;
            // Fill 1st column (Down->Up)
            for(int i=maxr; i>=minr; i--){
                if(head==null) break;
                ans[i][minc] = head.val;
                head = head.next;
            } minc++;
            
        }
        return ans;
        
    }
}