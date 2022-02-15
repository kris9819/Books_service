package com.books.BooksService.domain;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "saleability",
        "isEbook",
        "listPrice",
        "retailPrice",
        "buyLink",
        "offers"
})
@Generated("jsonschema2pojo")
public class SaleInfo {

    @JsonProperty("country")
    public String country;
    @JsonProperty("saleability")
    public String saleability;
    @JsonProperty("isEbook")
    public Boolean isEbook;
    @JsonProperty("listPrice")
    public ListPrice listPrice;
    @JsonProperty("retailPrice")
    public RetailPrice retailPrice;
    @JsonProperty("buyLink")
    public String buyLink;
    @JsonProperty("offers")
    public List<Offer> offers = null;

}