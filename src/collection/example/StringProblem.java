package collection.example;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringProblem {

    public static void main(String[] args) {

        String s="My  Name  is  Anurag";
        System.out.println("Trough IntStream-----------");
        IntStream.range(0,s.length()).forEach(i-> System.out.println(s.charAt(s.length() - 1 - i)));

        String str = "My  Name  is  Samir";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        String strNew = "My  Name  is  Raghav";
        //String strRep=strNew.replaceAll("\\s", "");

        String sb= Stream.of(strNew)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(""));
        System.out.println("SB Is---" +sb);

        String[] arrayOfString={"Ishan","Anurag","Samir"};
       // String su=Arrays.asList(arrayOfString).stream().collect(Collectors.joining(" "));
        System.out.println("---------natural order");
        Arrays.asList(arrayOfString).stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        //System.out.println("SU is--" + su);

        /**Find First Repeating word  */
        String s5="anurag shukla";

        Map<Character,Long> countNoofChar=s5.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Optional<Character> firtrep=countNoofChar.entrySet().stream().filter(e -> e.getValue() >1).map(e ->e.getKey()).skip(1).findFirst();
        //countNoofChar.forEach((k,v) -> System.out.println("Key is--"+ k + "Value is" + v));
        char m=(char)s5.chars().filter(c ->s5.indexOf(c)!=s5.lastIndexOf(c)).findFirst().getAsInt();
        System.out.println("m---" +m);


            System.out.println(firtrep.get());
        String input="Basanta";
        Map<String, Long> output = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output is=" +output);

        List<Employee> employees= Stream.of(new Employee(1,"Basanta","DEV",50000.45),
                new Employee(2,"Anurag","DEV",70000),
                new Employee(3,"Samir","QA",70000),
                new Employee(4,"Raju","QA",90000),
                new Employee(5,"Runno","DEVOPS",40000),
                new Employee(6,"Ritu","DEVOPS",1300000)).collect(Collectors.toList());
        //Map<String, List<Employee>> empDeptWise = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
/**
        Comparator<Employee> compBySal = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> deptWiseMaxSal = employees.stream().
         collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(compBySal))));
         System.out.println(deptWiseMaxSal);*/

        //Comparator<Employee> compBySal = Comparator.comparing(Employee::getSalary);
        Map<String, Employee> collectAndTh = employees.stream().
                collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get
                        )));
        System.out.println(collectAndTh);



        //System.out.println(empDeptWise);



    }
}
