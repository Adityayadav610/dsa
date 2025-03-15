class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        System.out.println(n);
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans.append(s.charAt(i));
            }
            else if(i%2!=0) {
                char ans1=(char)(s.charAt(i-1)+s.charAt(i)-'0');
                ans.append(ans1);
               
            }

        }
        return ans.toString();

       
        
    }
}