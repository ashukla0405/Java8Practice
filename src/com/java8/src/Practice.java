package com.java8.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {

        List<String> firstName=Arrays.asList("Anu","Robin","Goldi","Tutu");
        System.out.println(firstName.stream());
        //System.out.println(firstName.stream().count());
        //System.out.println(firstName.stream().count());
        //System.out.println(Arrays.asList("Anu","Robin","Goldi","Tutu").stream().count());
        //System.out.println(Arrays.asList("Anu","Robin","Goldi","Tutu").stream().count());
        int i[]={1,2,3};
        System.out.println(Arrays.stream(i).count());
        System.out.println(Arrays.stream(i).count());
    }
}
