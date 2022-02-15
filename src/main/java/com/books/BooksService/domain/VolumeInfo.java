package com.books.BooksService.domain;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "subtitle",
        "authors",
        "publishedDate",
        "industryIdentifiers",
        "readingModes",
        "pageCount",
        "printType",
        "categories",
        "maturityRating",
        "allowAnonLogging",
        "contentVersion",
        "panelizationSummary",
        "language",
        "previewLink",
        "infoLink",
        "canonicalVolumeLink",
        "publisher",
        "description",
        "imageLinks",
        "averageRating",
        "ratingsCount"
})
@Generated("jsonschema2pojo")
public class VolumeInfo {

    @JsonProperty("title")
    public String title;
    @JsonProperty("subtitle")
    public String subtitle;
    @JsonProperty("authors")
    public List<String> authors = null;
    @JsonProperty("publishedDate")
    public String publishedDate;
    @JsonProperty("industryIdentifiers")
    public List<IndustryIdentifier> industryIdentifiers = null;
    @JsonProperty("readingModes")
    public ReadingModes readingModes;
    @JsonProperty("pageCount")
    public Integer pageCount;
    @JsonProperty("printType")
    public String printType;
    @JsonProperty("categories")
    public List<String> categories = null;
    @JsonProperty("maturityRating")
    public String maturityRating;
    @JsonProperty("allowAnonLogging")
    public Boolean allowAnonLogging;
    @JsonProperty("contentVersion")
    public String contentVersion;
    @JsonProperty("panelizationSummary")
    public PanelizationSummary panelizationSummary;
    @JsonProperty("language")
    public String language;
    @JsonProperty("previewLink")
    public String previewLink;
    @JsonProperty("infoLink")
    public String infoLink;
    @JsonProperty("canonicalVolumeLink")
    public String canonicalVolumeLink;
    @JsonProperty("publisher")
    public String publisher;
    @JsonProperty("description")
    public String description;
    @JsonProperty("imageLinks")
    public ImageLinks imageLinks;
    @JsonProperty("averageRating")
    public Float averageRating;
    @JsonProperty("ratingsCount")
    public Integer ratingsCount;

}