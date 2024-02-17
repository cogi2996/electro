package com.change.electro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
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

    //Những người đã review sản phẩm
    @ManyToMany
    @JoinTable(name = "Review", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> reviewers;

    // Những bình luận của sản phẩm
    @ManyToMany
    @JoinTable(name = "Review", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "review_id"))
    private List<Review> reviews;

    // Danh mục của sản phẩm này
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
