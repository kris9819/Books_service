package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "viewability",
        "embeddable",
        "publicDomain",
        "textToSpeechPermission",
        "epub",
        "pdf",
        "webReaderLink",
        "accessViewStatus",
        "quoteSharingAllowed"
})
@Generated("jsonschema2pojo")
public class AccessInfo {

    @JsonProperty("country")
    public String country;
    @JsonProperty("viewability")
    public String viewability;
    @JsonProperty("embeddable")
    public Boolean embeddable;
    @JsonProperty("publicDomain")
    public Boolean publicDomain;
    @JsonProperty("textToSpeechPermission")
    public String textToSpeechPermission;
    @JsonProperty("epub")
    public Epub epub;
    @JsonProperty("pdf")
    public Pdf pdf;
    @JsonProperty("webReaderLink")
    public String webReaderLink;
    @JsonProperty("accessViewStatus")
    public String accessViewStatus;
    @JsonProperty("quoteSharingAllowed")
    public Boolean quoteSharingAllowed;

}