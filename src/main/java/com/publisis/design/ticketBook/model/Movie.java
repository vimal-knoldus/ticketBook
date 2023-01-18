package com.publisis.design.ticketBook.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Movie {

    @Id
    private Long id;
    private String title;
    private String description;
    private String duration;
    private String genre;
    @JsonProperty("cast")
    private String actingCast;
}
