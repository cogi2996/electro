package com.change.electro.entity;

import jakarta.persistence.*;

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

    // Order đang sở hữu item này
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order itemOrder;

    // Product mà orderItem này đang giữ
    // dùng để truy lại id product ( sau gắn link sản phẩm )
    @OneToOne
    @JoinColumn(name="product_id")
    private Product product;
}
