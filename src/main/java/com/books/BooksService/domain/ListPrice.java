package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amount",
        "currencyCode"
})
@Generated("jsonschema2pojo")
public class ListPrice {

    @JsonProperty("amount")
    public Float amount;
    @JsonProperty("currencyCode")
    public String currencyCode;

}