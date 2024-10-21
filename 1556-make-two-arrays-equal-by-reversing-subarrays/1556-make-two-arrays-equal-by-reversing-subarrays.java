class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {  
            return false; 

        }
        Map<Integer, Integer> countMapTarget = new HashMap<>();  
        Map<Integer, Integer> countMapArr = new HashMap<>();  

        
        for (int num : target) {  
            countMapTarget.put(num, countMapTarget.getOrDefault(num, 0) + 1);  
        }  

       
        for (int num : arr) {  
            countMapArr.put(num, countMapArr.getOrDefault(num, 0) + 1);  
        }  

      
        return countMapTarget.equals(countMapArr);  
    

        
         

        
    }
}