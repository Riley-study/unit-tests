import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar4.HW4.Book.Book;
import seminar4.HW4.Book.BookRepository;
import seminar4.HW4.Book.BookService;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    BookRepository bookRepository;
    BookService bookService;
    @BeforeEach
    void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void findBookByIdTest(){
        Book book1 = new Book("1", "Book1", "Author1");
        when(bookRepository.findById("1")).thenReturn(book1);

        // проверяем, что метод возвращает нужный элемент
        assertEquals(book1, bookService.findBookById("1"));

        // проверяем, что метод возвращает нужный параметр элемента
        assertEquals("Book1", bookService.findBookById("1").getTitle());

        //  проверяем, что во время исполнения метода он запускается два раза
        verify(bookRepository,times(2)).findById("1");

    }

    @Test
    void findAllBookByIdTest(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("1", "Book1", "Author1"));
        bookList.add(new Book("2", "Book2", "Author2"));
        when(bookService.findAllBooks()).thenReturn(bookList);

        // проверяем, что метод выдает список из двух элементов
        assertThat(bookService.findAllBooks().size()).isEqualTo(2);

        //  проверяем, что во время исполнения метода он запускается один раз
        verify(bookRepository,times(1)).findAll();

    }

}
