package com.java8.src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStreamPractice {
    public static void main(String[] args) {
        System.out.println("Min Startted");

        String s1="anurag shukla";

        String newS1=Stream.of(s1).map(i -> new StringBuilder(i).reverse()).collect(Collectors.joining(""));
        System.out.println(newS1);

        String s3="anurag shukla";
        //long l=Stream.of(s3).filter(i -> i==(char)a).count();
        long l=s3.chars().filter(ch -> ch=='a').count();
        System.out.println(l);

        String s6="My  Name  is  Anurag";
        IntStream.range(0,s6.length()).forEach(i-> System.out.println(s6.charAt(s6.length() - 1 - i)));

        //Sort List of Strings in Increasing order of their Length
        Arrays.asList("anu","shuk","tp").stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
