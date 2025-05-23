package ru.books.jdbc_books;

import java.util.List;

public interface BookRepository {
        List<Book> findAllBooks();
    }

