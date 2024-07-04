class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && b == c) {
            // a, b, c 모두 동일
            answer = (a + b + c) * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2)) * 
                ((int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3));;
        } else if (a == b || b == c || a == c) {
            // 두 숫자만 동일
            answer = (a + b + c) * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2));
        } else {
            // a, b, c 모두 동일X
            answer = a + b + c;
        }
        
        return answer;
    }
}
