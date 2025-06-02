package ru.books.jdbc_books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.books.jdbc_books.repository.BookRepository;
import ru.books.jdbc_books.model.Book;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

  @GetMapping("/book/all")
  public List<Book> getAllBooks() {
      return bookRepository.findAllBooks();
    }

    @GetMapping("/book/{id}")
    Book getBookById(@PathVariable("id") Long id) {
        return bookRepository.findBookById(id);
    }

}