package com.change.electro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @Column(name = "order_item_id", length = 100)
    private String orderItemId;
    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;
}
