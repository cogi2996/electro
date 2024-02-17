package com.change.electro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    @Column(name = "cart_item_id", length = 100)
    private String cartItemId;
    @Column(name = "quantity")
    private int quantity;

    // giỏ hàng của item này
    @ManyToOne
    @JoinColumn(name="cart_id")
    private Cart cart;

    // Sản phẩm đã lưu vào giỏ ( sau này để get ra id làm link dẫn tới sản phẩm )
    @OneToOne
    @JoinColumn(name="product_id")
    private Product product;

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId='" + cartItemId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
