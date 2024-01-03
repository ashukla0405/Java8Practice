package test.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysProgram {

    public static void main(String[] args) {

        /** Program to find Missing No in Array

        1) Sum of the series: Formula: n (n+1)/2( but only work for one missing number)
        2) Use BitSet, if an array has more than one missing element. */
/**
        int [] missingNo={1,2,3,4,6};
        int totalCount=6;


        int expectedSum=totalCount * (totalCount+1)/2;
        int actualSum=0;
        for(int i:missingNo){
            actualSum+=i;

        }
        System.out.println("Missing No is---" + (expectedSum-actualSum));



*/

/** remove duplicate from Array

        int [] missingNo={1,2,3,2,4,6};
        List<Integer> noList=Arrays.stream(missingNo).boxed().collect(Collectors.toList());
        noList.stream().distinct().forEach(System.out::println);
 */

/**Find duplicate using two for loop */

/**

        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < my_array.length-1; i++)
        {
           // System.out.println("Enter in first if where i is --"+ i);
            for (int j = i+1; j < my_array.length; j++)
            {
                //System.out.println("Enter in second if where j is --"+ j);
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
*/

/* Find duplicate using stream api*/

/**
        List<Integer> itemsList = Arrays.asList(10, 12, 10, 33, 40, 40, 61, 61);
        Set<Integer> newSets=new HashSet<>();
        itemsList.stream().filter(nums -> !newSets.add(nums)).forEach(System.out::println);
*/

/** Find second smallest element in the given array */

/**
int [] numbers={5,2,8,3,1,1};
int smallInt=Arrays.stream(numbers).distinct().sorted().skip(1).
        findFirst().orElseThrow(() ->
                new IllegalArgumentException("Array don't have second smallest element"));
        System.out.println("Second Smallest Element is---"+ smallInt );
 */

        int [] elements1={1,2,3,4,5,6,7,8,9};
        //Arrays.stream(elements1).map(em -> em*5).forEach(System.out::println);
        List<Integer> modVal=Arrays.stream(elements1).map(em -> em*5).boxed().collect(Collectors.toList());
        modVal.forEach(System.out::println);

        String s1="india is my country";
        long j=s1.chars().filter(c -> c=='i').count();
        System.out.println("The no of occurance of i is- " + j);


        String input = "india is my country";

        String [] array = input.split("");
        System.out.println("array length is " + array.length);
        Arrays.stream(array).forEach(System.out::println);

        Map<String, Long> output = Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        output.forEach((k,v) -> System.out.println("K is -" + k +"  v is-" +v));
/**
 *  find common element between tow array
 */
int[] a1={1,2,3,4,5};
int[] a2={4,5,6,7,8};
        List<Integer> commElement=Arrays.stream(a1).filter(num -> Arrays.stream(a2).anyMatch(num1 -> num1==num)).boxed().collect(Collectors.toList());
        commElement.forEach(System.out::println);

        /**
         * reverse inplace array
         * */
        int[] inplaceArray={1,2,3,4,5};
        System.out.println("inplaceArray length---" + inplaceArray.length);
        System.out.println("inplaceArray length/2---" + inplaceArray.length/2);
        IntStream.range(0,inplaceArray.length/2).forEach(i -> {
            int temp=inplaceArray[i];
            inplaceArray[i]=inplaceArray[inplaceArray.length-i-1];
            inplaceArray[inplaceArray.length-i-1]=temp;
        });
        System.out.println("inplaceArray" + Arrays.toString(inplaceArray));






    }
}
