package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class GroupByPractice {
    public static void main(String[] args) {

        List<String> strings = List.of("a", "bb", "cc", "ee","ddd");

        Map<Integer, List<String>> result = strings.stream()
                .collect(groupingBy(String::length, filtering(s -> !s.contains("c"), toList())));

        System.out.println("Result" + result); // {1=[a], 2=[bb], 3=[ddd]}

        List<String> fruitNames = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
        Map<String, Integer> fruitMap = new HashMap<>();
        for(String f:fruitNames){
            if(fruitMap.containsKey(f))
                fruitMap.put(f, fruitMap.get(f) + 1);
            else
                fruitMap.put(f, 1);
        }
        System.out.println("Map is  --" + fruitMap);

        List<String> strings1 = List.of("a", "bb", "cc", "ddd");

        Map<Integer, List<String>> result1 = strings1.stream()
                .collect(groupingBy(String::length, filtering(s -> !s.contains("c"), toList())));
        System.out.println("------------------------------------------------");
        System.out.println(result1); // {1=[a], 2=[bb], 3=[ddd]}

        }



    }

