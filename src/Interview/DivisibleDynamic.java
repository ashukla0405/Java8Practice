package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DivisibleDynamic {

    public static void main(String[] args) {

        Map<Integer, List<Integer>> mMap=new HashMap<>();
        List<Integer> lstInt= Arrays.asList(4,15,25);
        List<Integer> lstInt2=new ArrayList<>();
        List<Integer> lstInt3=new ArrayList<>();
        List<Integer> lstInt5=new ArrayList<>();
        int a[]={2,3,5};




        lstInt.stream()
                .forEach(
                        pair -> {
                            if (pair%a[0]==0) {
                                lstInt2.add(pair);
                                mMap.put( a[0], lstInt2);
                                System.out.println("Divide by " +a[0]  + pair.intValue());
                            } if (pair%a[1]==0) {
                                lstInt3.add(pair);
                                mMap.put(a[1], lstInt3);
                                System.out.println("Divide by 3 " +a[1]+  pair.intValue());
                            } if (pair%a[2]==0) {
                                lstInt5.add(pair);
                                mMap.put(a[2], lstInt5);
                                System.out.println("Divide by 5 " +a[2]+ pair.intValue());

                            } else {
                                System.out.println("no value");

                            }
                            //return mMap;
                        }
                );
        System.out.println("M Map is"+ mMap);

        //lstInt.stream().collect(Collectors.groupingBy(Function.identity(),))


    }
}
