package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "isAvailable",
        "acsTokenLink"
})
@Generated("jsonschema2pojo")
public class Pdf {

    @JsonProperty("isAvailable")
    public Boolean isAvailable;
    @JsonProperty("acsTokenLink")
    public String acsTokenLink;

}