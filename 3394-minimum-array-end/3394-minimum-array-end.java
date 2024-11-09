class Solution {
    public long minEnd(int n, int x) {
        List<Integer> lst=new ArrayList<>();
        long num=x;
        long calc=n-1;
        for(int i=0;i<32;i++){
            if((x &(1<<i) )== 0){
                lst.add(i);
            }

        }
        for(int i=32;i<64;i++){
            lst.add(i);
        }
        for(int i=0;calc>0;i++,calc>>=1){
            num +=(calc & 1L) << lst.get(i);
        }
        return num;
        
        
    }
}