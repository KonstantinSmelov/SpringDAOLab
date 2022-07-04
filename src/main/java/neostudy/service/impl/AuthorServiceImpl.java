package neostudy.service.impl;

import lombok.RequiredArgsConstructor;
import neostudy.dao.AuthorRepository;
import neostudy.entity.Author;
import neostudy.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }
}
