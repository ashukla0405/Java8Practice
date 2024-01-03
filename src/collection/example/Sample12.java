package collection.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample12 {

    public static void main(String[] args) {

        String s5="anurag shukla";

        Map<Character,Long> countNoofChar=s5.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Optional<Character> firtrep=countNoofChar.entrySet().stream().filter(e -> e.getValue() >1).map(e ->e.getKey()).findFirst();
        //countNoofChar.forEach((k,v) -> System.out.println("Key is--"+ k + "Value is" + v));
        //char m=(char)s5.chars().filter(c ->s5.indexOf(c)!=s5.lastIndexOf(c)).findFirst().getAsInt();
        System.out.println("firtrep---" +firtrep.get());
    }
}
