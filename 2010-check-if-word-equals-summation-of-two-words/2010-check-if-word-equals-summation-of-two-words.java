class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
      int first = convert(firstWord);
      int second = convert(secondWord);
      int target = convert(targetWord);
        return (first+second==target);
    }
    int convert(String word)
    {
        int ans=0;
        for(int i=0;i<word.length();i++)
        {
            ans = ans*10 + word.charAt(i) - 97;
        }
        return ans;   
        
    }
}