package OopsConcepts;

public class AbstractClass1 extends AbstractClass {
     public void method1(){

         System.out.println("1");

     }
     public void method2(){
         System.out.println("2");

     }
     public void method3(){

         System.out.println("3");

     }

    public static void main(String[] args) {
        AbstractClass1 d = new AbstractClass1();
        d.method1();
        d.method2();
        d.method3();
    }


}
