class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);
        
        String plus1 = num1 + num2 ;
        String plus2 = num2 + num1 ;
        
        if( Integer.parseInt(plus1) > Integer.parseInt(plus2) ){
            answer = Integer.parseInt(plus1);
        }else {
             answer = Integer.parseInt(plus2);
        }
      
        
        return answer;
    }
}