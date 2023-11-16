package DSA;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hussain";

        // this one scenario

        StringBuilder s = new StringBuilder(str);

        System.out.println(s.reverse().toString());

        //this is another scenario

        String m = "";

        for (int i = 0; i < str.length(); i++) {

            m =  str.charAt(i)+m;

        }
        System.out.println(m);
    }
}
