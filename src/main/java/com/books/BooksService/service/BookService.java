package com.books.BooksService.service;

import com.books.BooksService.repository.BookDAO;
import com.books.BooksService.domain.Book;
import com.books.BooksService.domain.BookSearch;
import com.books.BooksService.domain.BooksFromAPI;
import com.books.BooksService.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.TimeoutException;

@Service
public class BookService {

    private static final String API_LINK= "https://www.googleapis.com/books/v1/volumes?q=%s+inauthor:%s%s";
    private static final String API_KEY = "&key=AIzaSyBjolH8gNHdpvI-LH2Pxd_MYYze7p6rIrM";

    @Autowired
    RabbitTestService rabbitTestService;

    @Autowired
    BookDAO bookDAO;

    public Iterable<Book> showBooks() {
        return bookDAO.findAll();
    }

    public void addBook(Book book) throws IOException, NoSuchAlgorithmException, KeyManagementException, TimeoutException {
        bookDAO.save(book);
    }

    public void deleteBook(Long id) {
        bookDAO.deleteById(id);
    }

    public Book findBook(Long id) {
        Optional<Book> book = bookDAO.findById(id);
        if (book.isPresent())
            return book.get();
        return null;
    }

    public void editBook(Book book) {
        Book editedBook = findBook(book.getId());
        bookDAO.save(book);
    }

    public List<Book> findBookInExternalAPI(BookSearch bookSearch) {
        List<Book> bookList = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();
        BooksFromAPI booksFromAPI = restTemplate.getForObject(String.format(API_LINK,
                bookSearch.getTitle(), bookSearch.getAuthor(), API_KEY), BooksFromAPI.class);

        for (Item item : booksFromAPI.items) {
            bookList.add(Book.builder()
                    .title(item.volumeInfo.title)
                    .author(item.volumeInfo.authors.toString().replace("[", "").replace("]", ""))
                    .category(item.volumeInfo.categories.toString().replace("[", "").replace("]", ""))
                    .publishDate(item.volumeInfo.publishedDate)
                    .pages(item.volumeInfo.pageCount)
                    .build());
        }

        return bookList;
    }

    public Book findBy(String titlle, String author) {
        return bookDAO.findByTitleAndAuthor(titlle, author);
    }

    public List<Book> findBooksById(List<Long> ids) {
        return bookDAO.findBookByIdIsIn(ids);
    }

}
