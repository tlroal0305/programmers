class Solution {
    public String solution(String[] arr) {
        String answer = "";
  
        if( 1 <= arr.length && arr.length <= 200 ){
            for( int i = 0; i < arr.length; i++ ){
                System.out.print(arr[i]);
                answer += arr[i].toString();
            }
        }
        
        return answer;
    }
}