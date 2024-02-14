package com.change.electro.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Order")
public class Order {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "order_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTime;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "status")
    private int status;

    // Người đã đặt hàng
    @OneToMany(mappedBy = "orders")
    private User orderUser;

    // Các sản phẩm đã order của user
    @OneToMany(mappedBy = "itemOrder")
    private List<OrderItem> listItems;

}
