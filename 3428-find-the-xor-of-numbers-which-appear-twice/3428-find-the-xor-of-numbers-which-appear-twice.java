class Solution {
    public int duplicateNumbersXOR(int[] nums) {
    HashMap<Integer, Integer> countMap = new HashMap<>();  
    for (int num : nums) {  
    countMap.put(num, countMap.getOrDefault(num,0) +1);  
    }  
    int result =0;  
    for (int num : countMap.keySet()) {  
    if (countMap.get(num) ==2) {  
    result ^= num;  
    }  
    }  
    return result;
        
    }
}