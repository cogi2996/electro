package com.change.electro.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "cart_id", length = 100)
    private String cartId;

    //Các item trong giỏ hàng
    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

}
