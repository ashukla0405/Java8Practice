package com.java8.src;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracWithSamir {

    public static void main(String[] args) {

         OptionalDouble op=Arrays.asList(1,2,3,4).stream().mapToInt(i ->i).average();

        Arrays.asList(1,2,3,4).stream().mapToInt(i ->i).average();
        IntStream.of(1,2,3,4).average().ifPresent(System.out::println);
         op.ifPresent(System.out::println);


        Arrays.asList("Anu","Samir").stream().map(String::toLowerCase).forEach(System.out::println);



        IntStream.of(1,2,3,4,5,6,7,8).filter(p ->p%2==0).sum();

        Map<Boolean, Integer> output1 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8).
                boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.summingInt(Integer::intValue)));

        Map<Boolean, List<Integer>> output2 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8).
                boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(output2);
        //IntStream.of(1,2,3,4,5,6,7).b


        Arrays.asList("anu","shu","anu").stream().distinct().forEach(System.out::println);

        List<String> as=Arrays.asList("anu","shu","shan");
        List<String>  as1=as.stream().filter(i -> i.startsWith("s")).collect(Collectors.toList());
        System.out.println(as1.size());


        List<String> as5=Arrays.asList("xyz","anu","shu","bhan");
        as5.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        as5.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        int im=IntStream.of(1,28,99,0).max().getAsInt();
        System.out.println(im);

        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 28, 99, 0).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());


        int io=IntStream.of(1,9,5,9).sorted().skip(1).findFirst().getAsInt();
        System.out.println(io);

        int il=IntStream.of(1,9,5,9).boxed().sorted(Comparator.reverseOrder()).findFirst().get().intValue();
        System.out.println(il);

        int[] an={9,11,5,6};
        int[] reverseArr=IntStream.rangeClosed(1,an.length).map(i -> an[an.length-i]).toArray();
        //Arrays.toString(reverseArr);
        System.out.println("reverseArr is " + Arrays.toString(reverseArr));


    }
}
