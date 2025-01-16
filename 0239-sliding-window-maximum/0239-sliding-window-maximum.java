class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        if(nums==null && k<=0){
            return new int[0];
        }
        int[] result=new int[n-k+1];
        int ri=0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peek()<i-k+1){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
                result[ri++]=nums[dq.peek()];
            }
        }
        return result;
    }
}