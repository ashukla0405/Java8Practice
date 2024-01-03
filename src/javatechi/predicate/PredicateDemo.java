package javatechi.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**
public class PredicateDemo  implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        if (t%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate=new PredicateDemo();
        System.out.println(predicate.test(4));
    }
}
 */

//Using Lmbda
public class PredicateDemo   {

    public static void main(String[] args) {
        //Predicate<Integer> predicate=(t) -> t%2==0;
        /**
            if (t%2==0){
            return true;
        }
        else {
            return false;
        }*/
        //filter is the example of Predicate

        //System.out.println(predicate.test(7));

        List<Integer> lst1= Arrays.asList(1,2,3,4,5);
        //lst1.stream().forEach(consm);
        //lst1.stream().filter(predicate).forEach(t -> System.out.println("Printing t-" + t));
        lst1.stream().filter(t -> t%2==0).forEach(t -> System.out.println("Printing t-" + t));
    }
}
