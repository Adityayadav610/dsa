class Solution {
    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
    StringBuilder s = new StringBuilder();
        
    for (char c : target.toCharArray()) {
        s.append('a');
        result.add(s.toString());
            
        while (s.charAt(s.length() - 1) != c) {
            char lastChar = s.charAt(s.length() - 1);
            lastChar = (lastChar == 'z') ? 'a' : (char)(lastChar + 1);
            s.setCharAt(s.length() - 1, lastChar);
            result.add(s.toString());
        }
    }
        
    return result;
    }
}