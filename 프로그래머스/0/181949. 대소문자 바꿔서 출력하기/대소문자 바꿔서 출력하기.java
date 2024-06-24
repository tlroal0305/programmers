import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = ' ';

        if (str.length() >= 1 && str.length() <= 20) {
            for( int i = 0; i < str.length(); i++){
                c = str.charAt(i);

                // Char -> Strign 변환
                String NewStr = Character.toString(c);

                // 대소문자 변경
                if( NewStr.equals(NewStr.toLowerCase())){
                    NewStr = NewStr.toUpperCase();
                } else if ( NewStr.equals(NewStr.toUpperCase())) {
                    NewStr = NewStr.toLowerCase();
                }

                System.out.print(NewStr);

            }
        }
        

            }
        }