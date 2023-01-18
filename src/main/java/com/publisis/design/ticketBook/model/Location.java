package com.publisis.design.ticketBook.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Location {

    @Id
    private Long id;
    private String city;
}
