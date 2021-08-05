package net.litecj702.UserService.item.entity;

import lombok.Data;

@Data
class CartItem {
    private Item item;
    private int quantity;

    private CartItem(){}

    CartItem(Item item) {this.item = item; this.quantity = 1;}
}
