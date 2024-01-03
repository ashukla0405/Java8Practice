package javatechi.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
/**
public class SupplierDemo  implements Supplier<String> {

    @Override
    public String get() {
        return "Hi Anurag";
    }

    public static void main(String[] args) {
        Supplier<String> supplier=new SupplierDemo();
        System.out.println("Supplier print-" + supplier.get());
    }
}
 */

public class SupplierDemo   {


    public static void main(String[] args) {
        Supplier<String> supplier= () -> "Hi Romir";
        //System.out.println("Supplier print-" + supplier.get());

        List<String> lst2= Arrays.asList();
        System.out.println(lst2.stream().findAny().orElseGet(supplier));
    }
}
