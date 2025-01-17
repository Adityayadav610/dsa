class Solution {
    public boolean doesValidArrayExist(int[] derived) {

        int n=derived.length;
        if(n==0){
            return true;

        }

        for(int i=0;i<=1;i++){
            int[] original=new int[n];
            original[0]=i;
        
        for(int j=0;j<n-1;j++){
            original[j+1]=derived[j]^original[j];
        }
        if((original[n-1]^original[0])==derived[n-1]){
            return true;
        }
        }
        return false;
        
    }
}