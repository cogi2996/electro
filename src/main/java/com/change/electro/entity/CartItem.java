package com.change.electro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    @Column(name = "cart_item_id", length = 100)
    private String cartItemId;
    @Column(name = "quantity")
    private int quantity;
}
