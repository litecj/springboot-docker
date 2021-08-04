package net.litecj702.UserService.dish;

import reactor.core.publisher.Flux;

public class KitchenService {

    Flux<Dish> getDishes(){
        return Flux.just(new Dish("Sesame chicken"), new Dish("lo mein noodles, plain"), new Dish("Sweet&sour beef"));
    }
}
