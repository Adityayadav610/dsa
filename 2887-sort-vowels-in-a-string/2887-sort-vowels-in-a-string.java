class Solution {
    public String sortVowels(String s) {
        List<Character> vowelList=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                vowelList.add(c);
            }
        }
        Collections.sort(vowelList);
        StringBuilder ans=new StringBuilder();
        int vowelIndex=0;
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                ans.append(vowelList.get(vowelIndex++));

            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) !=-1;
    }
}