package neostudy.dto;

import lombok.Builder;
import lombok.Data;
import neostudy.entity.Author;
import java.util.List;

@Data
@Builder
public class BookDTO {
    private String title;
    private Integer price;
    private List<Author> authors;
}
