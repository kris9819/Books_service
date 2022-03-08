package com.books.BooksService.domain;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "totalItems",
        "items"
})
@Generated("jsonschema2pojo")
public class BooksFromAPI {

    @JsonProperty("kind")
    public String kind;
    @JsonProperty("totalItems")
    public Integer totalItems;
    @JsonProperty("items")
    public List<Item> items = null;

}