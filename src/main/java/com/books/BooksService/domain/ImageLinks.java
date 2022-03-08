package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "smallThumbnail",
        "thumbnail"
})
@Generated("jsonschema2pojo")
public class ImageLinks {

    @JsonProperty("smallThumbnail")
    public String smallThumbnail;
    @JsonProperty("thumbnail")
    public String thumbnail;

}