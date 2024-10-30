class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int ans=x;
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;

        }
        if(ans%sum==0){
            return sum;
        }
        return -1;
        
    }
}