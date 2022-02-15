package com.books.BooksService.repository;

import com.books.BooksService.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDAO extends CrudRepository<Book, Long> {
    Book findByTitleAndAuthor(String title, String author);
    List<Book> findBookByIdIsIn(List<Long> bookIds);
}
