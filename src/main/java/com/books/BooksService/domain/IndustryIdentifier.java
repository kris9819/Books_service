package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "identifier"
})
@Generated("jsonschema2pojo")
public class IndustryIdentifier {

    @JsonProperty("type")
    public String type;
    @JsonProperty("identifier")
    public String identifier;

}
