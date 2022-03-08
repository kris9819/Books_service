package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amountInMicros",
        "currencyCode"
})
@Generated("jsonschema2pojo")
public class RetailPrice__1 {

    @JsonProperty("amountInMicros")
    public Integer amountInMicros;
    @JsonProperty("currencyCode")
    public String currencyCode;

}