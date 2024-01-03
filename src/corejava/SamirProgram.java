package corejava;

import java.lang.invoke.ConstantBootstraps;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SamirProgram {

    public static void main(String args[]) {

        nonRepeateChar("ababcdde");
        //firstRepeatingChar();
        streamExcercise();
    }

    public static char nonRepeateChar(String str) {
        char[] charArray=str.toCharArray();
        LinkedHashSet<Character> linkedHashSet=new LinkedHashSet<>();
        for(int i=0;i<charArray.length;i++) {
            if(linkedHashSet.contains(charArray[i])) {
                linkedHashSet.remove(charArray[i]);
            } else {
                linkedHashSet.add(charArray[i]);
            }
        }
        System.out.println(linkedHashSet.stream().toArray()[1]);
        return 'c';
    }

    public static char firstRepeatingChar() {
        String str="anurag shukla";
        char ch=(char)str.codePoints().filter(is-> str.indexOf(is)!=str.lastIndexOf(is)).findFirst().getAsInt();
        System.out.println(ch);

        Map<Character,Long> charCountMap=str.chars().mapToObj(c-> (char)c).
                collect(Collectors.groupingBy(a->a, LinkedHashMap::new,Collectors.counting()));
        Character ch1=charCountMap.entrySet().stream().filter(c->c.getValue()>1).findFirst().get().getKey();
        System.out.println(ch1);
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointCount(0,str.length()));
        System.out.println(str.codePointBefore(1));
        List<String> strList= Arrays.asList("one","two","three","four","five");
        Stream<String> strStream=strList.stream();
        System.out.println(strStream.count());
        System.out.println(strStream.count());

        return ch;
    }
    public static void streamExcercise() {

        //1. Write a Java program to calculate the average of a list of integers using streams.
        IntStream.of(5,6,7,8,9,10,14,18).average().ifPresent(System.out::println);

        // 2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

        List<String> strList=List.of("One","Two","Three","Four");
        List<String> modifiedList=strList.stream().map(String::toLowerCase).collect(Collectors.toList());
        modifiedList.stream().forEach(System.out::println);

        //3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

        int sum=IntStream.of(45,34,2,3,56,78,90,100).filter(p-> p%2==0).sum();
        System.out.println(sum);
        Map<Boolean, Integer> collect = IntStream.of(45, 34, 2, 3, 56, 78, 90, 100).boxed().collect(Collectors.partitioningBy(p -> p % 2 == 0, Collectors.summingInt(Integer::intValue)));

        Map<Boolean, List<Integer>> collect1 = IntStream.of(45, 34, 2, 3, 56, 78, 90, 100).boxed().collect(Collectors.partitioningBy(p -> p % 2 == 0));
        System.out.println(collect);
        System.out.println(collect1);

        // Write a Java program to remove all duplicate elements from a list using streams.
        List<String> numList=Arrays.asList("One","Two","Three","Four","One","Two","Three","Four");
        List<String> distinctList = numList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        // 5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.
        long l=numList.stream().filter(s->s.toLowerCase().startsWith("t")).count();
        System.out.println(l);

        //6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> unSortedList=Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine");
        List<String> sortedList=unSortedList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        List<String> reverseSortedList=unSortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedList);

        //7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
        OptionalInt minOptional=IntStream.of(45,34,2,3,56,78,90,100).min();
        minOptional.ifPresent(System.out::println);

        OptionalInt maxOptional=IntStream.of(45,34,2,3,56,78,90,100).max();
        maxOptional.ifPresent(System.out::println);

        IntSummaryStatistics summaryStatistics=IntStream.of(45,34,2,3,56,78,90,100).summaryStatistics();
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());

        //8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        int secondSmallest=IntStream.of(45,34,2,3,56,78,90,100).sorted().skip(1).findFirst().getAsInt();
        System.out.println(secondSmallest);
        Integer secondLargest=IntStream.of(45,34,2,3,56,78,90,100).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);
        IntStream.of(45, 34, 2, 3, 56, 78, 90, 100).boxed().collect(Collectors.groupingBy(i -> i % 2 == 0));

        int a[][]={{9,4,5},
                {6,7,8}};
        Arrays.stream(a).flatMapToInt(b->Arrays.stream(b)).filter(i->i==3).findFirst().ifPresent(System.out::println);
        //Reverse the array
        int arr[]={45,34,2,3,56,78,90,100};
        int[] reverseArr =IntStream.rangeClosed(1, arr.length).map(i-> arr[arr.length-i]).toArray();
        System.out.println("--------------------------------------");
        Arrays.stream(reverseArr).forEach(System.out::println);
        //Sum of of odd elements
        System.out.println(IntStream.of(45, 34, 2, 3, 56, 78, 90, 100).filter(i->i%2!=0).sum());

        //Sort list as per their length
        List<String> unSortedList1=Arrays.asList("seventy","One","Two","Three","Four","Five","Six","Seven","Eight","Nine");
        List<String> collect2 = unSortedList1.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(collect2);

        //Reverse the String
        String nameStr="My name is Samir";
        String str2 = IntStream.rangeClosed(1, nameStr.length()).mapToObj(i -> Character.toString(nameStr.charAt(nameStr.length() - i))).collect(Collectors.joining());
        String str3=Stream.of(nameStr).map(i->new StringBuilder(i).reverse()).collect(Collectors.joining());
        System.out.println(str2);
        System.out.println(str3);

        List<String> stringWithNumbers=Arrays.asList("1seventy","One","Two","6Three","Four","Five","Six","7Seven","Eight","Nine");
        List<String> numList1 = stringWithNumbers.stream().filter(i -> i.codePointAt(0) >= "0".codePointAt(0) && i.codePointAt(0) <="9".codePointAt(0)).collect(Collectors.toList());
        System.out.println(numList1);

        System.out.println("***********"+"0".codePointAt(0));

        Map<Character,Long> occurancesChar=nameStr.toLowerCase().chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurancesChar);

        occurancesChar.forEach((k,v)-> System.out.println("K is---" + k +"  v is--"+ v));
        //Frequesncy of each character in String
        Map<Character,Long>ctrMap= nameStr.chars().filter(c->c!=' ').mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(ctrMap);
        String vovelStr="Hello hello";
        String vovel="aeiou";
        List<String> strList3=vovelStr.chars().mapToObj(c->Character.toString(c)).filter(c->vovel.contains(c)).collect(Collectors.toList());
        long vovelCount=vovelStr.chars().mapToObj(c->Character.toString(c)).filter(c->vovel.contains(c)).count();
        System.out.println(strList3);
        System.out.println(vovelCount);

        String repeatedWord="this is repeated word is this word true";
        List<String>duplicateList=Arrays.stream(repeatedWord.split(" ")).filter(c->repeatedWord.indexOf(c)!=repeatedWord.lastIndexOf(c)).distinct().collect(Collectors.toList());
        System.out.println(duplicateList);
        String repeatedWord1="abcdefgh";
        List<Integer> ctrList = new ArrayList<>();
        String reverseNoSymbols = IntStream.range(0, repeatedWord1.length()).mapToObj((i) -> {
            if (Character.isLetter(repeatedWord1.codePointAt(repeatedWord1.length() - 1 - i))) {
                return Character.toString(repeatedWord1.charAt(repeatedWord1.length() - 1 - i));
            }
            ctrList.add(repeatedWord1.length() - 1 - i);
            return "";
        }).collect(Collectors.joining());


        String result = reverseNoSymbols;
        for (int i = ctrList.size() - 1; i >= 0; i--) {
            result = result.substring(0, ctrList.get(i)) + repeatedWord1.charAt(ctrList.get(i)) + result.substring(ctrList.get(i));
        }
        System.out.println(result);
        int generateSeed=0;
        Stream.generate(()->{

                    return generateSeed+1;

                })
                .limit(5)
                .forEach(System.out::println);

        Arrays
                .asList("Geeks",
                        "For",
                        "Geek",
                        "GeeksForGeeks",
                        "A Computer Portal");
        Pattern p = Pattern.compile(" ");
        long count1 = p.splitAsStream("Geeks GeeksForGeeks For").count();
        System.out.println(count1);
        String[][] strArr1={{"A","80"},{"B","70"},{"C","60"},{"D","50"},{"A","40"}};
        Map<String,Double> map1=Arrays.stream(strArr1).collect(Collectors.groupingBy(i->i[0],Collectors.averagingInt(i->Integer.parseInt(i[1]))));
        System.out.println(map1);
        //map1.co
        map1.values().stream().max(Comparator.naturalOrder()).get();

        String maxName=map1.entrySet().stream().filter(i->i.getValue()==map1.values().stream().max(Comparator.naturalOrder()).get()).map(i->i.getKey()).collect(Collectors.joining());
        System.out.println(maxName);
        int[] numArr={54,23,45,67,78,89,90,32,54,65,76,87,98,9,9,9,9,9,9,9};
        int[] dividBy={2,3,5};
        // Arrays.stream(dividBy).collect(Collectors.groupingBy(i->i,Collectors.filtering(j->Arrays.stream(numArr)%j))

      /*  double highestAvg = Arrays.stream(strArr1)
                .collect(groupingBy(s -> s[0],
                        averagingInt(s -> Integer.parseInt(s[1]))))
                .values()
                .stream()
                .max(Comparator.naturalOrder())
                .get();
*/
        Map<Integer, Long> collect3 = Arrays.stream(numArr).boxed().collect(Collectors.groupingBy(i->i, Collectors.counting()));
        int mode=collect3.entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).findFirst().get().getKey();
        System.out.println(collect3);
        //Integer mode=collect3.entrySet().stream().filter(e-> maxOptional(e.getValue()))
        int mode1=collect3.entrySet().stream().max(Map.Entry.<Integer, Long>comparingByValue()).get().getKey();
        System.out.println(mode1);
        String[] nameArr={"samir","Anurag","Prachi","Himani","Ishan","Romir", "Chelsi"};
        List<String> oddNameList=IntStream.range(0,nameArr.length).filter(i->i%2!=0).mapToObj(i->nameArr[i]).collect(Collectors.toList());
        System.out.println(oddNameList);




    }
}

