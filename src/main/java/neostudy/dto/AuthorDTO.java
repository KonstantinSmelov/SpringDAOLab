package neostudy.dto;

import lombok.Builder;
import lombok.Data;
import neostudy.entity.Book;

import java.util.List;

@Data
@Builder
public class AuthorDTO {
    private String name;
    private List<Book> books;
}
