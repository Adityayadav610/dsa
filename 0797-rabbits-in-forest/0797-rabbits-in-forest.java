import java.util.Hashtable;  

class Solution {  
    public int numRabbits(int[] answers) {  
        
        Hashtable<Integer, Integer> map = new Hashtable<>();  

       
        for (int num : answers) {  
            map.put(num, map.getOrDefault(num, 0) + 1);  
        }  

        int totalCount = 0;  

        
        for (int count : map.keySet()) {  
            int numRabbits = map.get(count);  
           
           
            int groupSize = count + 1;  
           
            
            totalCount += (numRabbits + groupSize - 1) / groupSize * groupSize;  
        }  

        return totalCount;  
    }  
}  