package net.io.practice;

import java.util.*;
import java.util.stream.Collectors;

public class EmpGrpBy {
    public static void main(String[] args) {

        List<Employee> empList=new ArrayList<Employee>();

        Employee emp1=new Employee(1,"Anurag","HR",95000);
        Employee emp2=new Employee(2,"Romir","HR",90000);
        Employee emp3=new Employee(3,"Chelsi","HR",85000);
        Employee emp4=new Employee(4,"Samir","Admin",75000);
        Employee emp5=new Employee(5,"Ishan","Admin",65000);
        Employee emp6=new Employee(6,"Vivek","Sales",55000);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);

        //empList.forEach(System.out::println);

        //Map<String,List<Employee>> empMap=empList.stream().collect(Collectors.groupingBy(Employee::getEmpDept));

        //empMap.forEach((k,v) -> System.out.println(("K Is--" + k + "   value is---" + v)));

        //List<Employee> empSortLst=empList.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).collect(Collectors.toList());

        //empSortLst.forEach(System.out::println);
        List<Employee> empNew=empList.stream().sorted(Comparator.comparingDouble(Employee::getEmpSal).reversed()).limit(1).collect(Collectors.toList());
        empNew.forEach(System.out::println);

        Employee eml=empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSal))).get();
        System.out.println("eml--"+eml);
        Integer im=Arrays.asList(11,29,5,27,18,17).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("In is --"+ im);

        //Arrays.asList("a","b","c","d","e","f","g").stream().filter(i->i.i)








    }
}
