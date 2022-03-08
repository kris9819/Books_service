package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "text",
        "image"
})
@Generated("jsonschema2pojo")
public class ReadingModes {

    @JsonProperty("text")
    public Boolean text;
    @JsonProperty("image")
    public Boolean image;

}