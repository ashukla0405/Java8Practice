package corejava;

public class MainClass {
    public static void main(String[] args) {
        A a=new B();
        a.method1();
    }
}

class A {

    static void method1(){

        System.out.println("Calling Method of class A");
    }
}
class B extends A{
    static void  method1(){
        System.out.println("Calling method of class B");
    }

}
