package DSA;

public class ReverseNumber {

    public static void main(String[] args) {
        int a = 123455;

        int reverse=0;

        while(a!=0){
            int reminder = a % 10;

            reverse = reverse * 10 + reminder;

            a = a/10;


        }

        System.out.println("start");
        System.out.println(reverse);
        System.out.println("end");

    }
}
