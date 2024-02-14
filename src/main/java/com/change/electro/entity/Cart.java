package com.change.electro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "cart_id", length = 100)
    private String cartId;


}
