package net.io.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrimeNo {
    public static void main(String[] args) {
        // Define the prime check lambda expression
        Predicate<Integer> is_Prime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                System.out.println("Enter in predicate " + i);

                if (n % i == 0) {
                    System.out.println("Enter in divide---is " +i);
                    return false;
                }
            }
            return true;
        };

        // Check if a number is prime using the lambda expression
        //int n = 16;
        //boolean isPrimeResult = is_Prime.test(n);
        // Print the prime check result
        //System.out.println(n + " is prime? " + isPrimeResult);

        int[] arryLst={15,17,16};
        List<Integer> numbers=Arrays.asList(15,17,16);

        /**System.out.println(numbers.stream()
                .filter(PrimeNo::is_Prime)
                .collect(toList()));*/



        // Check if a number is prime using the lambda expression
        //n = 15;
        //isPrimeResult = is_Prime.test(n);
        // Print the prime check result
        //System.out.println("\n"+n + " is prime? " + isPrimeResult);
    }
}


