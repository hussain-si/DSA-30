package OopsConcepts;





// Java supports multiple inheritance through interfaces
class MyClass implements A, B {

    public void methodA() {
        // implementation of methodA
        System.out.println("method A");
    }


    public void methodB() {
        // implementation of methodB
        System.out.println("method b");
    }

    public static void main(String[] args) {

        MyClass s = new MyClass();

        s.methodA();
        s.methodB();
    }
}
