package test.array;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayPractice {
    public static void main(String[] args) {

        Integer [] missingNo={1,2,3,2,4,6};
        Set<Integer> mSet=new HashSet<>();
        List<Integer> updVal= Arrays.asList(missingNo).stream().filter(i -> !mSet.add(i)).collect(Collectors.toList());
        System.out.println("updVal--" + updVal);

        int [] intArrays={1,2,2,3,3,9};
        List<Integer> col123 = Arrays.stream(intArrays).boxed().distinct().toList();
        //Arrays.stream(intArrays).distinct().forEach(System.out::println);
        //System.out.println(col123);

        //find second smallest
        int [] numbers1={5,2,8,3,1,1};
        int secSmaal=Arrays.stream(numbers1).distinct().sorted().skip(1).findFirst().getAsInt();
        //System.out.println(secSmaal);

        Integer[] a1={1,2,3,4,5};
        Integer[] a2={4,5,6,7,8};
        List<Integer> list12 = Arrays.stream(a1).
                filter(num -> Arrays.stream(a2).anyMatch(num1 -> num1 == num)).toList();
        System.out.println(list12);


    }
}
