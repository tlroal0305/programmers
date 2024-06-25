class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int Number1 = my_string.length();
        int Number2 = overwrite_string.length();
        System.out.print("Numbers: " + Number1 + Number2);

        if (overwrite_string.length() >= 1 && 
            overwrite_string.length() <= my_string.length() &&
            my_string.length() <= 1000) {
            
            if (s >= 0 && s <= (my_string.length() - overwrite_string.length())) {
                answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
            }
        }

        return answer;
    }
}
