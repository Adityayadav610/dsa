class Solution {
    public int[] diStringMatch(String s) {
       int n=s.length();
       int[] arr=new int[n+1];
       int left=0;
       int right=n;
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='I'){
            arr[i]=left;
            left++;
        }else if(s.charAt(i)=='D'){
            arr[i]=right;
            right--;
        }
        

       }
       arr[n]=left;
       return arr;

        
    }
}