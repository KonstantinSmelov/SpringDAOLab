CREATE TABLE author_book
(
    author_id bigserial references authors,
    book_id   bigserial references books,
    PRIMARY KEY (author_id, book_id)
);

INSERT INTO author_book
VALUES (1, 1),
       (2, 2),
       (2, 3),
       (3, 2),
       (3, 3),
       (4, 4),
       (5, 4),
       (5, 5),
       (6, 6),
       (6, 7),
       (6, 8)

