class Solution {
    public String[] findWords(String[] words) {
          HashSet<Character> row1 = new HashSet<>();  
        HashSet<Character> row2 = new HashSet<>();  
        HashSet<Character> row3 = new HashSet<>();  

        for (char c : "qwertyuiop".toCharArray()) row1.add(c);  
        for (char c : "asdfghjkl".toCharArray()) row2.add(c);  
        for (char c : "zxcvbnm".toCharArray()) row3.add(c);  

        List<String> result = new ArrayList<>();  

        for (String word : words) {  
            String lowerWord = word.toLowerCase();  
            char firstChar = lowerWord.charAt(0);  
            HashSet<Character> currentRow;  

            if (row1.contains(firstChar)) {  
                currentRow = row1;  
            } else if (row2.contains(firstChar)) {  
                currentRow = row2;  
            } else {  
                currentRow = row3;  
            }  

            boolean canTypeInOneRow = true;  
            for (char c : lowerWord.toCharArray()) {  
                if (!currentRow.contains(c)) {  
                    canTypeInOneRow = false;  
                    break;  
                }  
            }  

            if (canTypeInOneRow) {  
                result.add(word);  
            }  
        }  

        return result.toArray(new String[0]); 
    }
}