package com.java8.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntStrList {
    public static void main(String[] args) {

        int[] intArray = {8, 1, 10, 2};
        System.out.println("Primitive Data-type Integer Array Before sort : " + Arrays.toString(intArray));
                //Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Primitive Data-type Integer Array After sort : " + Arrays.toString(intArray) + "\n");
//In-build Class String Array sort
        String[] strArray = {"C", "O", "D", "E", "R", "S", "T", "E", "A"};
        System.out.println("In-build Class String Array Before sort : " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("In-build Class String Array After sort : " + Arrays.toString(strArray) + "\n");
//List Collection of String type sort
        List<String> listOfStringType = new ArrayList<>(Arrays.asList("C", "O", "D", "E", "R", "S", "T", "E", "A"));
        System.out.println("List Collection of String type Before sort : " + listOfStringType.stream().collect(Collectors.joining(", ")));
        Collections.sort(listOfStringType); //Sorting From Collection Class as Mentioned Above
        System.out.println("List Collection of String type After sort : " + listOfStringType.stream().collect(Collectors.joining(", ")));

    }
}
