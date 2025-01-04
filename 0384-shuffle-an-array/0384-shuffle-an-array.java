class Solution {
    int[] og;
    int[] arr;
     Random random;

    public Solution(int[] nums) {
        og=nums.clone();
        arr=nums.clone();
        random=new Random();
        
    }
    
    public int[] reset() {
        arr=og.clone();
        return arr;
        
    }
    
    public int[] shuffle() {
        for(int i=arr.length-1;i>0;i--){
            int j=random.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */