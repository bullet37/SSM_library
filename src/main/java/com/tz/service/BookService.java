package com.tz.service;

import com.tz.pojo.Book;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @Auther: tz / bullet37
 * @Description: com.tz.service.BookService
 * @version: 1.0
 */
public interface BookService {
    //add a book
    int addBook(Book books);

    //delete a book
    int deleteBookById(int id);

    //update a book
    int updateBook(Book book);

    // find a book by its id
    Book queryBookById(int id);

    // get all books
    List<Book> queryAllBook();

    // select book by its id
    List<Book> queryBookByName(String name);
}
