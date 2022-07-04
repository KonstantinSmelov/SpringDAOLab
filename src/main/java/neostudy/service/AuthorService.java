package neostudy.service;

import neostudy.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthors();
    void saveAuthor(Author author);
}
