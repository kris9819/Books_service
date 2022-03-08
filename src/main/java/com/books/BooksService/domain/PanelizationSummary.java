package com.books.BooksService.domain;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "containsEpubBubbles",
        "containsImageBubbles"
})
@Generated("jsonschema2pojo")
public class PanelizationSummary {

    @JsonProperty("containsEpubBubbles")
    public Boolean containsEpubBubbles;
    @JsonProperty("containsImageBubbles")
    public Boolean containsImageBubbles;

}