package DSA;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateChar {

    public static void main(String[] args) {
        String str = "Hussain";
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        StringBuilder f = new StringBuilder();
        for(char s : str.toCharArray()){
           set.add(s);
        }
        for(char s : set){
            f.append(s);
        }
        System.out.println(f);
    }


}
//  String input = "hussain";
//
//        HashSet<Character> charSet = new HashSet<Character>();
//        StringBuilder result = new StringBuilder();
//
//        for (char c : input.toCharArray()) {
//            if (charSet.add(c)) {
//                result.append(c);
//            }
//        }
//        System.out.println("Original string: " + input);
//        System.out.println("String without duplicates: " + result.toString());
