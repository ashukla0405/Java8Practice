package Interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String s="@anurag_shukla";

        String newStr=Stream.of(s).map(c -> new StringBuilder(c).reverse()).collect(Collectors.joining(""));
        System.out.println(newStr);





    }
}
