package net.litecj702.UserService.dish;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
class SimpleServer {
    private final KitchenService kitchen;

    Flux<Dish> doingMyJob(){
        return kitchen.getDishes().map(dish->Dish.deliver(dish));    }
}
