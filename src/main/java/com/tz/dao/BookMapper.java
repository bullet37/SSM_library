package com.tz.dao;

import com.tz.pojo.Book;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @Auther: tz / bullet37
 * @Description: com.tz.dao.BookMapper
 * @version: 1.0
 */

public interface BookMapper {
    //add a book
    int addBook(Book books);

    //delete a book
    int deleteBookById(@Param("ID") int id);

    //updata a book
    int updateBook(Book book);

    // find a book by its id
    Book queryBookById(@Param("ID") int id);

    // get all books
    List<Book> queryAllBook();

    // select book by its id
    List<Book> queryBookByName(@Param("Name") String name);

}
