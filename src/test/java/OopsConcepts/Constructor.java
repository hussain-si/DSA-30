package OopsConcepts;

public class Constructor {

    //It is special method which is use to initialize the data member
    /*
    Rules

    1. the method name and class name should be same
    2. it does not have any return type
    3. it does not return any value
    4. it always non-static
    5. when ever we create object constructor will get invoked
    */

    int a=18;



    public static void main(String[] args) {

        Constructor d =new Constructor(4);
        System.out.println(d.a);
    }

     Constructor(int a) {
        System.out.println(this.a);
        this.a=a;
        System.out.println(a);

    }
}
