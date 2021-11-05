package com.books.BooksService.BooksService.service;

import com.books.BooksService.BooksService.dao.BookDAO;
import com.books.BooksService.BooksService.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookDAO bookDAO;

    public Iterable<Book> showBooks() {
        return bookDAO.findAll();
    }

    public void addBook(Book book) {
        book.setUuid("1z2x3c");
        bookDAO.save(book);
    }
}
