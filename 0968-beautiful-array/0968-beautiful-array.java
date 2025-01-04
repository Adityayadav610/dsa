class Solution {
    public int[] beautifulArray(int n) {
        
        return BeautifulArray(n);
       
        
    }
    public static int[] BeautifulArray(int n){
        if(n==1){
            return new int[]{1};
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:BeautifulArray((n+1)/2)){
            ans.add(i*2-1);
        }
        for(int i:BeautifulArray((n/2))){
            ans.add(i*2);
        }
         return ans.stream().mapToInt(i -> i).toArray(); 
    }
}