package com.change.electro.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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
    @Column(name="text")
    private String text;


    // Những người đã bình luận bài Product này
    @ManyToMany
    @JoinTable(name="Review",joinColumns = @JoinColumn(name="review_id"),inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<User> reviewUsers;

    // Các sản phẩm đã được review
    @ManyToMany(mappedBy = "reviews")
    private List<Product> products;

}
