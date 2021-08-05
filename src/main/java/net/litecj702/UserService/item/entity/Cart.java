package net.litecj702.UserService.item.entity;

import lombok.Data;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;


@Data

public class Cart {
    private @Id String id;
    private List<CartItem> cartItems;


    public Cart(String id){this(id, new ArrayList<>());}

    public Cart(String id, List<CartItem> cartItems){this.id = id;
    this.cartItems = cartItems;}
}
