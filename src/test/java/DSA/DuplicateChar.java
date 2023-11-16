package DSA;

import java.util.HashSet;

public class DuplicateChar {

    public static void main(String[] args) {
        String str = "Hussain";
        HashSet<Character> set = new HashSet<Character>();
        StringBuilder f = new StringBuilder();
        for(char s : str.toCharArray()){
            if(set.add(s)){
                f.append(s);
            }
        }
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
