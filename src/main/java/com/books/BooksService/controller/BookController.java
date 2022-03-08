package com.books.BooksService.controller;

import com.books.BooksService.domain.Book;
import com.books.BooksService.domain.BookList;
import com.books.BooksService.domain.BookSearch;
import com.books.BooksService.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeoutException;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/allbooks")
    public Iterable<Book> showBooks() {
        return bookService.showBooks();
    }

    @PostMapping("/addbook")
    public void addBook(@RequestBody Book book) throws IOException, NoSuchAlgorithmException, KeyManagementException, TimeoutException {
        bookService.addBook(book);
    }

    @GetMapping("/deletebook")
    public void deleteBook(@RequestParam("id") final Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/findbook/{id}")
    public Book findBook(@PathVariable Long id) {
        return bookService.findBook(id);
    }

    @PostMapping("/editbook")
    public void editBook(@RequestBody Book book) {
        bookService.editBook(book);
    }

    @GetMapping("/findBy")
    public Book findBy(@RequestBody BookSearch bookSearch) {
        return bookService.findBy(bookSearch.getTitle(), bookSearch.getAuthor());
    }

    @GetMapping("/getBooksByIdList")
    public List<Book> findByIdList(@RequestBody BookList bookList) {
        return bookService.findBooksById(bookList.getBookList());
    }

    @PostMapping("/findbook")
    public List<Book> findBookInExternalAPI(@RequestBody BookSearch bookSearch) {
        return bookService.findBookInExternalAPI(bookSearch);
    }
}
