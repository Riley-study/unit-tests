package seminar4.HW4.Book;

import java.util.List;

public interface BookRepository {

    Book findById(String id);

    List<Book> findAll();
}