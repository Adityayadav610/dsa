class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");  
        StringBuilder capitalizedTitle = new StringBuilder();  

        for (String word : words) {  
            if (word.length() <= 2) {   
                capitalizedTitle.append(word.toLowerCase());  
            } else {   
                capitalizedTitle.append(Character.toUpperCase(word.charAt(0)))  
                                .append(word.substring(1).toLowerCase());  
            }  
            capitalizedTitle.append(" ");  
        }   
        return capitalizedTitle.toString().trim();  
    }
}