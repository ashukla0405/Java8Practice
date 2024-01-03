package Interview;

import java.util.*;

public class DivisibleProg {
    public static void main(String[] args) {

        Map<Long,List<Integer>> mMap=new HashMap<>();
        List<Integer> lstInt=Arrays.asList(4,15,25);
        List<Integer> lstInt2=new ArrayList<>();
        List<Integer> lstInt3=new ArrayList<>();
        List<Integer> lstInt5=new ArrayList<>();


        lstInt.stream()
                .forEach(
                        pair -> {
                            if (pair%2==0) {
                                lstInt2.add(pair);
                                mMap.put(2L, lstInt2);
                                System.out.println("Divide by 2 " + pair.intValue());
                            } if (pair%3==0) {
                                lstInt3.add(pair);
                                mMap.put(3L, lstInt3);
                                System.out.println("Divide by 3 " + pair.intValue());
                            } if (pair%5==0) {
                                lstInt5.add(pair);
                                mMap.put(5L, lstInt5);
                                System.out.println("Divide by 5 " + pair.intValue());

                            } else {
                                System.out.println("no value");

                            }
                            //return mMap;
                        }
                );
        System.out.println("M Map is"+ mMap);


    }
}
