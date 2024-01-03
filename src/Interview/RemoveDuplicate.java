package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<Object>();
        al.add("abc");
        al.add('a');
        al.add('b');
        al.add('a');
        al.add("abc");
        al.add(10.3);
        al.add('c');
        al.add(10);
        al.add("abc");
        al.add(10);
        System.out.println("Before Duplicate Remove:"+al);
        for(int i=0;i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                if(al.get(i).equals(al.get(j))){
                    al.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing duplicate:"+al);
/**
        List<String> arrList=Arrays.asList("c","b","n","c","b");
        arrList.forEach(System.out::println);
        for(int i=0;i<arrList.size();i++){
            for(int j=i+1;j<arrList.size();j++){
                if (arrList.get(i).equals(arrList.get(j))){
                    arrList.remove(j);
                    j--;
                }
            }
 */

        }

    }





