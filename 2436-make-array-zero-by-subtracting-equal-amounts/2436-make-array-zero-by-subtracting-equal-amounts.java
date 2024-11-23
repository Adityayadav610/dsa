 class Solution {  
    public int minimumOperations(int[] nums) {  
        HashSet<Integer> uniquePositives = new HashSet<>();  
        
         
        for (int num : nums) {  
             
            if (num > 0) {  
                uniquePositives.add(num);  
            }  
        }  
        
        
        return uniquePositives.size();  
    }  
}