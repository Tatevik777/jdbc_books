package ru.books.jdbc_books.repository;

import ru.books.jdbc_books.model.Book;

import java.util.List;

public interface BookRepository {
        List<Book> findAllBooks();

        Book findBookById(Long id);
}

