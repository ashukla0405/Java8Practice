package net.io.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicte {

    public static void main(String[] args) {

        List<String> strList=new ArrayList<>();
        strList.add("anu");
        strList.add("anu");
        strList.add("himu");
        strList.add("chelu");



        List<String> strListWithoutDup=strList.stream().distinct().collect(Collectors.toList());
        //strListWithoutDup.forEach(System.out::println);

        Integer a[]={1,3,5,7,9,1,3};
        List<Integer> usingDistinct=Arrays.asList(a).stream().distinct().collect(Collectors.toList());
        System.out.println("usingDistinct--" + usingDistinct);
        Set<Integer> usingSet1 = Arrays.asList(a).stream().collect(Collectors.toSet());
        System.out.println("usingSet--"+usingSet1);
        //usingDistinct.forEach(System.out::println);
        //Arrays.asList(a).stream().filter(i-> i!=Set(int i))

        Set<Integer> usingSet=Arrays.asList(a).stream().distinct().collect(Collectors.toSet());
        //usingSet.forEach(System.out::println);


        List<Integer>sepEvenOdd=Arrays.asList(1,2,3,4,5,6,7);




        
    }

   
}
