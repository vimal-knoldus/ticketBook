package com.publisis.design.ticketBook.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Data
@Entity
public class Screen {

    @Id
    private Long id;
    private String name;
    @Column(name = "theater_id")
    private Long theaterId;
    @Column(name = "movie_id")
    private Long movieId;

}
