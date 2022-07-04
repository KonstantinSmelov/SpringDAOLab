package neostudy.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import neostudy.dao.BookRepository;
import neostudy.dto.BookDTO;
import neostudy.entity.Author;
import neostudy.entity.Book;
import neostudy.service.AuthorService;
import neostudy.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("lab")
public class SpringDAOLabController {

    private final BookService bookService;
    private final AuthorService authorService;
    private final BookRepository bookRepository;

    @ApiOperation("Получить список всех книг")
    @GetMapping("books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @ApiOperation("Получить список всех авторов")
    @GetMapping("authors")
    public ResponseEntity<List<Author>> getAllAuthors() {
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }

    @ApiOperation("Получить список всех книг автора")
    @GetMapping("books/byAuthor/{authorName}")
    public ResponseEntity<List<Book>> getAllBooksByAuthor(@PathVariable String authorName) {
        return new ResponseEntity<>(bookService.getAllBooksByAuthorName(authorName), HttpStatus.OK);
    }

    @ApiOperation("Получить информацию по книге")
    @GetMapping("books/byTitle/{bookTitle}")
    public ResponseEntity<BookDTO> getBook(@PathVariable String bookTitle) {
        return new ResponseEntity<>(bookService.getBookDTO(bookTitle), HttpStatus.OK);
    }

    @ApiOperation("Получить суммарную стоимость всех книг автора")
    @GetMapping("books/sumOfPrice/{authorName}")
    public ResponseEntity<Long> test(@PathVariable String authorName) {
        return new ResponseEntity<>(bookRepository.sumOfPriceByAuthor(authorName), HttpStatus.OK);
    }
}
