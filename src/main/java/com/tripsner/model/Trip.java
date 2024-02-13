package com.tripsner.model;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    private int id;
    private int userId;
    private int countryId;

    private String title;
    private String note;
    private Date begin;
    private Date end;
}
