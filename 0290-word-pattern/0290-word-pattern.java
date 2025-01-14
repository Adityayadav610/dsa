class Solution {
    public boolean wordPattern(String pattern, String s) {
     String[] words = s.split(" ");  
        if (pattern.length() != words.length) {  
            return false;  
        }  

        Map<Character, String> charToWordMap = new HashMap<>();  
        Map<String, Character> wordToCharMap = new HashMap<>();  

        for (int i = 0; i < pattern.length(); i++) {  
            char pChar = pattern.charAt(i);  
            String word = words[i];  

            if (charToWordMap.containsKey(pChar)) {  
                if (!charToWordMap.get(pChar).equals(word)) {  
                    return false;  
                }  
            } else {  
                charToWordMap.put(pChar, word);  
            }  

            if (wordToCharMap.containsKey(word)) {  
                if (wordToCharMap.get(word) != pChar) {  
                    return false;  
                }  
            } else {  
                wordToCharMap.put(word, pChar);  
            }  
        }  

        return true;     
    }
}