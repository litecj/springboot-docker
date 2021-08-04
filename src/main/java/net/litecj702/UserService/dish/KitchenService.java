package net.litecj702.UserService.dish;

import reactor.core.publisher.Flux;

public class KitchenService {
/**
 * Future 의 리턴 타입은 Scalar 이다
 * Flux 의 리턴 타입은 Vector 이다
 * ㅓJust()를 통해 비동기적으로 제공한다.(만들자 말자 바로)
 * */
    Flux<Dish> getDishes(){
        return Flux.just(new Dish("Sesame chicken"), new Dish("lo mein noodles, plain"), new Dish("Sweet&sour beef"));
    }
}
