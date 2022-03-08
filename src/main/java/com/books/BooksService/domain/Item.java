package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "id",
        "etag",
        "selfLink",
        "volumeInfo",
        "saleInfo",
        "accessInfo",
        "searchInfo"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("kind")
    public String kind;
    @JsonProperty("id")
    public String id;
    @JsonProperty("etag")
    public String etag;
    @JsonProperty("selfLink")
    public String selfLink;
    @JsonProperty("volumeInfo")
    public VolumeInfo volumeInfo;
    @JsonProperty("saleInfo")
    public SaleInfo saleInfo;
    @JsonProperty("accessInfo")
    public AccessInfo accessInfo;
    @JsonProperty("searchInfo")
    public SearchInfo searchInfo;

}