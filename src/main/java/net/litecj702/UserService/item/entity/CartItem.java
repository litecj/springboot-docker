package net.litecj702.UserService.item.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class CartItem {
    private Item item;
    private int quantity;

}
