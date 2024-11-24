class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        List<Character> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!lst.contains(s.charAt(i))){
                lst.add(s.charAt(i));
            }
            else{
                return s.charAt(i);
            }
        }
        return '0';
        
    }
}