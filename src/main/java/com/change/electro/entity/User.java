package com.change.electro.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="User")
public class User {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "role")
    private int role;

    //  User đã order
    @OneToMany(mappedBy = "orderUser")
    private List<Order> orders;

    //Giỏ hàng của user
    @OneToOne
    @JoinColumn(name="cart_id")
    private Cart userCart;

    // Các product mà user đã review
    @ManyToMany(mappedBy = "reviewers")
    private List<Product> products;

    // Các bình luận mà user đã bình luận
    @ManyToMany(mappedBy = "reviewUsers")
    private List<Review> reviews;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", role=" + role +
                '}';
    }
}
