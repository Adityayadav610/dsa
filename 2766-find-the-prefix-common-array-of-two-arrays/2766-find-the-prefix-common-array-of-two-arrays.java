class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] C =new int[n];
        Set<Integer> sA =new HashSet<>();
        Set<Integer> sB=new HashSet<>();
        for(int i=0;i<n;i++){
            sA.add(A[i]);
            sB.add(B[i]);
            int count=0;
            for(int num:sA){
                if(sB.contains(num)){
                    count++;
                }
            }
            C[i]=count;
        }
        return C;
        
    }
}