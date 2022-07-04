package neostudy.service;

import neostudy.dto.BookDTO;
import neostudy.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    BookDTO getBookDTO(String bookTitle);
    List<Book> getAllBooksByAuthorName(String authorName);
    void saveBook(Book book);
}
