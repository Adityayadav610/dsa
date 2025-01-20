class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        //String str=s.toLowerCase().trim();
        int left=0;
        int right=n-1;
        if(s.isEmpty()){
            return true;
        }
        while(left<=right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            
                return false;
                
            }
            left++;
            right--;
           
        }
        return true;
        
    }
}