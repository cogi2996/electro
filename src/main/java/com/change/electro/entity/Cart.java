package com.change.electro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "cart_id", length = 100)
    private String cartId;

    //Các item trong giỏ hàng
    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

    @Override
    public String toString() {
        return "Cart{" +
                "cartId='" + cartId + '\'' +
                '}';
    }
}
