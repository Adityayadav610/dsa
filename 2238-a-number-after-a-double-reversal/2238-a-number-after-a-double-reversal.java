class Solution {
    public boolean isSameAfterReversals(int num) {
        int reversed1=reverse(num);
        int reversed2=reverse(reversed1);
        if(reversed2==num){
            return true;
        }
        else{
            return false;
        }



    }
    public static int reverse(int num){
        int original=num;
        int digit=0;
        while(num>0){
            int n=num%10;
             digit=digit*10+n;
            num /=10;


        }
        return digit;
        
    }
}