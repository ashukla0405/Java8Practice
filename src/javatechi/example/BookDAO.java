package javatechi.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){

        List<Book> books=new ArrayList<>();
        books.add(new Book(101,"Z Java",1000));
        books.add(new Book(201,"B Java",200));
        books.add(new Book(1,"Y Java",5000));
        books.add(new Book(5,"A Java",100));

        return books;

    }
}
