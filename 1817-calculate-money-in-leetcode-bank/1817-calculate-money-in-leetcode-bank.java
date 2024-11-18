class Solution {
    public int totalMoney(int n) {
        int temp = 0;

        int ans = 0;

        while(n > 0) {
            if(n < 7) {
                ans += n*(n+1)/2 + temp * n;
            }
            else {
                ans += 28 + temp * 7;
            }

            temp++;
            n-=7;
        }

        return ans;
    }
}