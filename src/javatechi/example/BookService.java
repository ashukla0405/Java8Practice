package javatechi.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> lstBook=new BookDAO().getBooks();

        //First Approach
        //Collections.sort(lstBook,new MyComparator());
        //Second Approach - Annonymous method implementation through functional interface Comparator
        /**
        Collections.sort(lstBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/
        //third approach
        Collections.sort(lstBook,(o1,o2)->o2.getName().compareTo(o1.getName()));
        return lstBook;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

/**
class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}*/
