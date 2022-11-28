package com.tz.controller;

import com.tz.pojo.Book;
import com.tz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: tz / bullet37
 * @Description: com.tz.controller.BookController
 * @version: 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller layer calls  service layer

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    // show all books' info
    @RequestMapping("/getAllBook")
    public String listAllBook(Model model){
          List<Book> list = bookService.queryAllBook();
          model.addAttribute("list",list);
        return "getAllBook";
    }

    // jump to add
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    // Add a book
    @RequestMapping("/addBook")
    public String addBook(Book book){
        System.out.println("addBook=>"+book);
        bookService.addBook(book);
        return "redirect:/book/getAllBook";
    }

    // jump to update
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Book book = bookService.queryBookById(id);
        model.addAttribute("Qbook",book);
        return "updateBook";
    }

    // Update book info
    @RequestMapping("/updateBook")
    public String updateBook(Book book){
        System.out.println("updateBook=>"+book);
        bookService.updateBook(book);
        return "redirect:/book/getAllBook";
    }

    // Delete book
    @RequestMapping("/deleteBook/{ID}")
    public String deleteBook(@PathVariable("ID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/getAllBook";
    }

    // DO the query by book's name
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        List<Book> list = bookService.queryBookByName(queryBookName);
        model.addAttribute("list",list);
        return "getAllBook";
    }

}

