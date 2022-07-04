package neostudy.dao;

import neostudy.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book getBookByTitle(String bookTitle);

    List<Book> findByAuthors_Name(String authorName);

    @Query(value = "SELECT sum(books.price)" +
            "FROM books " +
            "JOIN author_book " +
            "ON books.id = author_book.book_id " +
            "JOIN authors " +
            "ON authors.id = author_book.author_id " +
            "WHERE authors.name = :authorName"
            , nativeQuery = true)
    Long sumOfPriceByAuthor(@Param("authorName") String authorName);

}
