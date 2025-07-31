class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int count=0;
        int start=0;
        int end=0;
        List<Character>list=new ArrayList<Character>();
        while(end<n){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                count=Math.max(count,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return count;
        
    }
}