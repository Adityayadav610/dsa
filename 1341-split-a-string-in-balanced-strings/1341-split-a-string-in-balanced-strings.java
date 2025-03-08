class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int balanced=0;
        //int balancedL;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                balanced++;

            }else if(s.charAt(i)=='L'){
                balanced--;
                
            }
            if(balanced==0){
                count++;
            }
        }
        return count;

        
    }
}