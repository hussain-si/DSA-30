package DSA;

import java.util.HashSet;

public class DuplicateNumber {

    public static void main(String[] args) {
        int a [] = {1,2,3,5,7,9,2,5,7,9,3};

        HashSet<Integer> set = new HashSet<Integer>();


        for (int num : a) {
            if (!set.add(num)) {
                set.add(num);
            }
        }

        System.out.println("Duplicates: " + set);
    }
}
