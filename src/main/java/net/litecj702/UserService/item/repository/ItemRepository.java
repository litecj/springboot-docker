package net.litecj702.UserService.item.repository;


import net.litecj702.UserService.item.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface ItemRepository extends ReactiveCrudRepository<Item, String> {

}
