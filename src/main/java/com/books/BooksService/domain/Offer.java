package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "finskyOfferType",
        "listPrice",
        "retailPrice"
})
@Generated("jsonschema2pojo")
public class Offer {

    @JsonProperty("finskyOfferType")
    public Integer finskyOfferType;
    @JsonProperty("listPrice")
    public ListPrice__1 listPrice;
    @JsonProperty("retailPrice")
    public RetailPrice__1 retailPrice;

}
