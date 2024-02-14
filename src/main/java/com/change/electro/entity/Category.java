package com.change.electro.entity;

import jakarta.persistence.*;

import java.util.List;

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

    // Các sản phẩm thuộc category này
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    // Danh mục cha của sản phẩm
    @ManyToOne
    @JoinColumn(name = "category_parent_id",referencedColumnName = "category_id")
    private Category cateParent;

    // Các danh mục sản phẩm con của category này ( nếu có )
    @OneToMany(mappedBy = "cateParent")
    private List<Category> childCate;
}
