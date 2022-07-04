package neostudy.service.impl;

import lombok.RequiredArgsConstructor;
import neostudy.dao.BookRepository;
import neostudy.dto.BookDTO;
import neostudy.entity.Book;
import neostudy.service.AuthorService;
import neostudy.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorService authorService;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public BookDTO getBookDTO(String bookTitle) {
        Book book = bookRepository.getBookByTitle(bookTitle);
        BookDTO bookDTO = BookDTO.builder()
                .price(book.getPrice())
                .title(book.getTitle())
                .authors(book.getAuthors())
                .build();
        return bookDTO;
    }

    @Override
    public List<Book> getAllBooksByAuthorName(String authorName) {
        return bookRepository.findByAuthors_Name(authorName);
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

}
