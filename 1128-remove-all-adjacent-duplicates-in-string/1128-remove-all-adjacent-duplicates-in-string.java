class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stck=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stck.isEmpty() && stck.peek()==c){
                stck.pop();
            }else{
                stck.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stck.isEmpty()){
            sb.append(stck.pop());
        }
        return sb.reverse().toString();
        
    }
}