package net.litecj702.UserService.dish;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
class PoliteServer {
    private final KitchenService kitchen;
    Flux<Dish>doingMyjob(){
        return kitchen.getDishes().doOnNext(dish -> System.out.println("Thank you for"+dish+"!"))
                .doOnError(error -> System.out.println("so sorry about" + error.getMessage()))
                .doOnComplete(()-> System.out.println("Thanks for all your hard work!"))
                .map(Dish::deliver);}


}
