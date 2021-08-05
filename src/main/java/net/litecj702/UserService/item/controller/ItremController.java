package net.litecj702.UserService.item.controller;

import lombok.RequiredArgsConstructor;
import net.litecj702.UserService.item.entity.Cart;
import net.litecj702.UserService.item.repository.CartRepository;
import net.litecj702.UserService.item.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;

@RestController@RequiredArgsConstructor
public class ItemController {
    private ItemRepository itemRepository;
    private CartRepository cartRepository;

    @GetMapping
    Mono<?> home(){
        return Mono.just(Rendering.view("home.html")
                .modelAttribute("items", this.itemRepository.findAll())
                .modelAttribute("cart", this.cartRepository.findById("My Cart")
                        .defaultIfEmpty(new Cart("My Cart"))).build());
    }
    //87p
    @PostMapping("/add/{id}")
    Mono<String> addTOCart(@PathVariable String id) {
        return null ;
//        return this.cartRepository.findById("My Cart")
//                .defaultIfEmpty(new Cart("My Cart")).flatMap(cart -> cart.getCartItems().stream()
//                        .filter(cartItem -> cartItem.getItem().getId().equals(id))
//                        .findAny().map(cartItem -> {
//                            //cartItem.increment();
//                            return Mono.just(cart);
//                        }).orElseGet(()->{
//                            return this.itemRepository.findById(id).map(item -> new CartItem(item)).map(cartItem -> {
//                                cart.getCartItems().add(cartItem);
//                                return cart;
//                            });
//                        })).flatMap(cart -> this.cartRepository.save(cart)).thenReturn("redirect:/");
    }
}
