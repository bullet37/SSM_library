import com.tz.pojo.Book;
import com.tz.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void queryAllBookTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        for (Book books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }

    @Test
    public void queryBookByNameTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        System.out.println(bookServiceImpl.queryBookByName("J"));
    }

    @Test
    public void queryBookByIdTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        System.out.println(bookServiceImpl.queryBookById(1));
    }
}

