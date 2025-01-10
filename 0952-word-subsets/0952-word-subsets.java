public class Solution{  
    
    public List<String> wordSubsets(String[] words1, String[] words2) {  
         
        int[] maxFrequency = new int[26]; 
        for (String word : words2) {  
            int[] currentFrequency = new int[26];  
            for (char c : word.toCharArray()) {  
                currentFrequency[c - 'a']++;  
            }  
              
            for (int i = 0; i < 26; i++) {  
                maxFrequency[i] = Math.max(maxFrequency[i], currentFrequency[i]);  
            }  
        }  

         
        List<String> result = new ArrayList<>();  
        for (String word : words1) {  
            int[] wordFrequency = new int[26];  
            for (char c : word.toCharArray()) {  
                wordFrequency[c - 'a']++;  
            }  

             
            boolean isUniversal = true;  
            for (int i = 0; i < 26; i++) {  
                if (wordFrequency[i] < maxFrequency[i]) {  
                    isUniversal = false;  
                    break;  
                }  
            }  

             
            if (isUniversal) {  
                result.add(word);  
            }  
        }  

        return result; 
    }  

    
}