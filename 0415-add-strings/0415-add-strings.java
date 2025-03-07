class Solution {
    public String addStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length()-1;
        int j = b.length()-1;
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if(i >= 0){
                sum = sum + (a.charAt(i) - '0');
                i--;
            }
            if(j >= 0){
                sum = sum + (b.charAt(j) - '0');
                j--;
            }
            result.append(sum % 10);
            carry = sum / 10;
        }

        return new String(result.reverse());
    }
}