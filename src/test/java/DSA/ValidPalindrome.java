package DSA;

import java.io.*;
import java.util.*;

public class ValidPalindrome {
    // Implement your solution by completing the below function

    public String isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();
        char ch;
        if(s == null || s.length()>1000)
            return "false";
        else{
            String str = s.toLowerCase();
            for(int i=0; i< str.length();i++){
                ch=str.charAt(i);
                if((ch>=48 && ch <=57) || ch>=97 && ch <=122)
                    s1.append(ch);
            }
            if( s1.toString().equals(s1.reverse().toString()) )
                return "true";
            else return "false";

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        String result = new ValidPalindrome().isPalindrome(line);
        System.out.print(result);
    }
}