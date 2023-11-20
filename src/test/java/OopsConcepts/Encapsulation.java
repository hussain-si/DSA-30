package OopsConcepts;

public class Encapsulation {

    private int a = 10;

    public static void main(String[] args) {
        Encapsulation d = new Encapsulation();

        d.setEncapsulation(4);

        System.out.println( d.getEncapsulation(d.a));
    }

    private void setEncapsulation(int d) {
        a=d;
    }

    private int getEncapsulation(int a) {

        return a;
    }


}
