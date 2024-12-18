class Solution {
    public String reorderSpaces(String text) {
         String[] words = text.trim().split("\\s+");  
        int wordCount = words.length;  
        
        
        int totalSpaces = text.length() - text.replace(" ", "").length();  

         
        if (wordCount == 1) {  
            return words[0] + " ".repeat(totalSpaces);  
        }  

        
        int spacesBetweenWords = totalSpaces / (wordCount - 1);  
       
        int remainingSpaces = totalSpaces % (wordCount - 1);  

        
        StringBuilder result = new StringBuilder();  
        for (int i = 0; i < wordCount; i++) {  
            result.append(words[i]);  
            if (i < wordCount - 1) {  
                result.append(" ".repeat(spacesBetweenWords)); 
            }  
        }  
        
       
        result.append(" ".repeat(remainingSpaces));  

        return result.toString();
        
    }
}