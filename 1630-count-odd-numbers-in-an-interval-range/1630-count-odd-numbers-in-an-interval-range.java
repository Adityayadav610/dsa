class Solution {
    public int countOdds(int low, int high) {
      return count(high)-count(low-1);
      
        
    }
    public int count(int n){
        if(n<0){
            return 0;
        }
        return (n+1)/2;
    }
}