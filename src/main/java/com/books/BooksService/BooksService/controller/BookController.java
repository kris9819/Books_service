package com.books.BooksService.BooksService.controller;

import com.books.BooksService.BooksService.domain.Book;
import com.books.BooksService.BooksService.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/allbooks")
    public Iterable<Book> showBooks() {
        return bookService.showBooks();
    }

    @PostMapping("/addbook")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }
}
