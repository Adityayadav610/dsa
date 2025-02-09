class Solution {
    public String toLowerCase(String s) {
      String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int charASCII = ch;

           
            if (charASCII >= 65 && charASCII <= 90) { 
                int lowerASCII = charASCII + 32; 
                result += (char) lowerASCII;
            } else {
                result += ch; 
            }
        }

        return result;  
    }
}