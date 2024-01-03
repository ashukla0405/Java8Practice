package javatechi;

@FunctionalInterface
public interface MyFunctionalInterface {

    public void m1();

    default void m2(){
        System.out.println("Calling m2 method");
    }
    default void m3(){
        System.out.println("calling m3 method");

    }

}
