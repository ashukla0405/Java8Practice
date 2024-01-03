package javatechi.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//Traditional Approach
/**
public class ConsumerDemo  implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("Printing t-" + t);
    }

    public static void main(String[] args) {
        ConsumerDemo consm=new ConsumerDemo();
        consm.accept(5);
    }
}
 */
public class ConsumerDemo {
    //For Each always accept consumer
    /**
     * @Override public void accept(Integer t) {
     * System.out.println("Printing t-" + t);
     * }
     */


    public static void main(String[] args) {
        //ConsumerDemo consm=new ConsumerDemo();
        //consm.accept(5);
        //Consumer<Integer> consm= t -> System.out.println("Printing t-" + t);
        //consm.accept(10);

        List<Integer> lst1= Arrays.asList(1,2,3,4,5);
        //lst1.stream().forEach(consm);
        lst1.stream().forEach(t -> System.out.println("Printing t-" + t));
    }
}

