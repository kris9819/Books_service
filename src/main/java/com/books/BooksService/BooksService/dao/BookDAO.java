package com.books.BooksService.BooksService.dao;

import com.books.BooksService.BooksService.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookDAO extends CrudRepository<Book, Long> {
}
