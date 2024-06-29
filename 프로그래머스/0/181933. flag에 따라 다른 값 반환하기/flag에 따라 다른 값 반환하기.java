class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if( a >= -1000 && b <= 1000){
            answer = (flag == true) ? ( a + b ) :  ( a - b );
            System.out.print(answer);
        }
        
        return answer;
    }
}