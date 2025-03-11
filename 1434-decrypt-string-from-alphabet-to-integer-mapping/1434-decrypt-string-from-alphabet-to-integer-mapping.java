class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result=new StringBuilder();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            int num;
            if(s.charAt(i)=='#'){
                num=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
                i-=2;
            }else{
                num=s.charAt(i)-'0';
            }
            result.append((char)(num+96));
        }
        return result.reverse().toString();

        
    }
}