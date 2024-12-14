class Solution {  
    public boolean halvesAreAlike(String s) {  
        int n = s.length();  
        int count1 = 0;  
        int count2 = 0;  
        
          
        String vowels = "aeiouAEIOU";  

        
        for (int i = 0; i < n / 2; i++) {  
            char currentChar = s.charAt(i);  
            if (vowels.indexOf(currentChar) != -1) {  
                count1++;  
            }  
        }  
        
       
        for (int j = n / 2; j < n; j++) {  
            char currentChar = s.charAt(j);  
            if (vowels.indexOf(currentChar) != -1) {  
                count2++;  
            }  
        }  
        
        return count1 == count2;  
    }  
}