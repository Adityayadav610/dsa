class Solution {
    public int numberOfSpecialChars(String word) {
 
    HashSet<Character> lowerSet = new HashSet<>();  
    HashSet<Character> upperSet = new HashSet<>();  
    int specialCount =0;  

    for (char c : word.toCharArray()) {  
    if (Character.isLowerCase(c)) {  
    lowerSet.add(c);  
    } else if (Character.isUpperCase(c)) {  
    upperSet.add(Character.toLowerCase(c));  
    }  
     }  

    for (char c : lowerSet) {  
     if (upperSet.contains(c)) {  
     specialCount++;  
    }  
    }  

    return specialCount;  
   
        
    }
}