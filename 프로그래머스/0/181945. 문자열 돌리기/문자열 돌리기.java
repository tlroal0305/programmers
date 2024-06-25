import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char NewStr = ' ';
        
        if( str.length() >= 2 && str.length() <= 10 ){
            for( int i = 0; i < str.length(); i++){
                NewStr = str.charAt(i);
                System.out.println(NewStr);
            }
        }
    }
}