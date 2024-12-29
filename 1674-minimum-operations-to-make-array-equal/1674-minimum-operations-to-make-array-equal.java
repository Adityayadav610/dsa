class Solution {
    public int minOperations(int n) {
        int target=n;
        int opr=0;
        for(int i=0;i<n;i++){
            int val=(2*i)+1;
            opr+=Math.abs(val-target);
        }
        return opr/2;
    }
}