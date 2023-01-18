package com.publisis.design.ticketBook.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Data
@Entity
public class Show {

    @Id
    private Long id;
    @Column(name = "screen_id")
    private Long screenId;
    @Column(name = "movie_id")
    private Long movieId;
    @Column(name = "show_date")
    private Date showDate;
    @Column(name = "start_time")
    private Time startTime;
    @Column(name = "end_time")
    private Time endTime;
}
