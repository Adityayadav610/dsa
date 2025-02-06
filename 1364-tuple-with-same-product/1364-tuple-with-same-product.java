class Solution {
    public int tupleSameProduct(int[] nums) {
       int n=nums.length; 
        HashMap<Integer,Integer> ht=new HashMap<>();
        int count=0;
         for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                count += 8 * ht.getOrDefault(product, 0);
                ht.put(product, ht.getOrDefault(product, 0) + 1);
            }

        return count;


    }
}