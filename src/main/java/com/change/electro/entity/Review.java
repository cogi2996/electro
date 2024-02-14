package com.change.electro.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int reviewId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "time")
    private Date time;

}
