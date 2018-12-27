import model.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import service.BookService;
import service.ServiceImpl.BookServiceImpl;

import static org.springframework.boot.SpringApplication.*;
@ComponentScan(
        basePackageClasses = {
                MyApplication.class,
                Book.class,
                BookService.class,
                BookServiceImpl.class})
@SpringBootApplication
public class MyApplication {
    static void main(String[] args) {

        run(MyApplication.class, args);

    }
}
