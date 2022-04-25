import cn.zlatanlgd.pojo.Books;
import cn.zlatanlgd.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookservice = (BookService) context.getBean("BookServiceImpl");
        for (Books book : bookservice.queryAllBooks()) {
            System.out.println(book);
        }
    }
}
