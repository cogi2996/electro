package com.change.electro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_id", length = 100)
    private String categoryId;
    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;
}
