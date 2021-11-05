package com.books.BooksService.BooksService.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books", schema = "public")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "publish_date", nullable = true)
    @JsonProperty(value = "publish_date")
    private String publishDate;
    @Column(name = "pages", nullable = true)
    private Integer pages;
    @Column(name = "uuid", nullable = false)
    private String uuid;
}
