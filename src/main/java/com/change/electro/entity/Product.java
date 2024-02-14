package com.change.electro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "product_id", length = 100)
    private String productId;
    @Column(name = "name", length = 255)
    private String name;
    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;
    @Column(name = "image_url", length = 255)
    private String imageUrl;

}
