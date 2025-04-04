class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morseCodes = {  
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",   
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",   
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."  
        };  
        
        Set<String> uniqueTransformations = new HashSet<>();  
        
        for (String word : words) {  
            StringBuilder morseWord = new StringBuilder();  
            for (char c : word.toCharArray()) {  
                morseWord.append(morseCodes[c - 'a']);  
            }  
            uniqueTransformations.add(morseWord.toString());  
        }  
        
        return uniqueTransformations.size();   
    }
}