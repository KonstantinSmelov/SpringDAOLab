CREATE TABLE authors
(
    id   bigserial primary key,
    name varchar
);

INSERT INTO authors
VALUES (1, 'Толкиен'),
       (2, 'Илья Ильф'),
       (3, 'Евгений Петров'),
       (4, 'Аркадий Стругацкий'),
       (5, 'Борис Стругацкий'),
       (6, 'Стивен Кинг')