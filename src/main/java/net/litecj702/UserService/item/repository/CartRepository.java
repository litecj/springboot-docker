package net.litecj702.UserService.item.repository;

import net.litecj702.UserService.item.entity.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart,String> {
}
