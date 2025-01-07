class Solution {
    public int[] frequencySort(int[] nums) {
       int n=nums.length;
         Map<Integer, Integer> frequencyMap = new HashMap<>();  
        for (int num : nums) {  
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);  
        }  

       
        List<Integer> numList = new ArrayList<>(frequencyMap.keySet());  
        Collections.sort(numList, (a, b) -> {  
            int freqCompare = Integer.compare(frequencyMap.get(a), frequencyMap.get(b));  
            return freqCompare != 0 ? freqCompare : Integer.compare(b, a); 
        });  

         
        int[] sortedArray = new int[nums.length];  
        int index = 0;  
        for (int num : numList) {  
            int freq = frequencyMap.get(num);  
            for (int i = 0; i < freq; i++) {  
                sortedArray[index++] = num;  
            }  
        }  
        return sortedArray;
    }
}