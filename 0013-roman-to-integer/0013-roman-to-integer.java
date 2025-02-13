class Solution {
//public static void main(String[] args){
   // romanToInt(s);
   // System.out.println(result);
//}
    
    public int romanToInt(String s) {
       int[] roman =new int[128];
       roman['I']=1;
       roman['V']=5;
       roman['X']=10;
       roman['L']=50;
       roman['C']=100;
       roman['D']=500;
       roman['M']=1000;

        
        

        int result=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && roman[s.charAt(i)] < roman[s.charAt(i+1)]) {
                result=result-roman[s.charAt(i)];
            }
            else{
                result=result + roman[s.charAt(i)];
            }
        }
        return result;

        
    }
}