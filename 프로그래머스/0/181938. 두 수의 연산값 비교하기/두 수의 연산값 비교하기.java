class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int value1 = 2 * a * b ;
        
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);
        int value2 = Integer.parseInt(num1+num2);
        
        if( value1 > value2 ){
            answer = value1;
        }else if( value1 < value2 ){
            answer = value2;
        }else {
            answer = value2;
        }
        
        
        return answer;
    }
}