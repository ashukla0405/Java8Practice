package net.io.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateEvenOdd {

    public static void main(String[] args) {

        List<Integer> combined= Arrays.asList(1,2,3,4,5,6,7);

       Map<Boolean,List<Integer>> sepEvenOdd = combined.stream().collect(Collectors.partitioningBy(i -> i%2==0));
        //sepEvenOdd.forEach(System.out::println);
        sepEvenOdd.forEach((k, v) -> System.out.println((k + ":" + v)));

    }
}
