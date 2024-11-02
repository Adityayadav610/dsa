class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int [] count=new int[101];
        for(int i=0;i<nums.size();i++){
            int start=nums.get(i).get(0);
            while(start<=nums.get(i).get(1)){
                count[start]++;
                start++;
            }
        }
        int ans=0;
        for(int j=1;j<101;j++){
            if(count[j]>0){
                ans++;
            }
        }
        return ans;

        
    }
}