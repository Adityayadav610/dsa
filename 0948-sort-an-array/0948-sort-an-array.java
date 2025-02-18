class Solution {
    public int[] sortArray(int[] nums) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }  

        int r[] =new int[nums.length];
        int j=0;
        while(!pq.isEmpty()){
            r[j++]=pq.poll();
        }  
        return r;   
    }
}