package net.litecj702.UserService.dish;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
/**
 * '@RequiredArgsConstructor' = 주방장의 인스턴스를 생성자 주입으로 받는다(연관관계)
 * 'kitchen.getDishes()' 는 알바가 주방에 가서 요리를 가져오는 모습이다.
 * 요리가 완성되면 즉시 손님에게 전달한다... map()
 * 'Reactive Consumer는 다른 Reactive Service를 호출하고 결과를 변환(transform)한다.
 * 서빙 점원의 역할은 웹 컨트롤이다.
 * */
@RequiredArgsConstructor
class PoliteServer {
    private final KitchenService kitchen;
    Flux<Dish>doingMyjob(){
        return kitchen.getDishes().doOnNext(dish -> System.out.println("Thank you for "+ dish+"!"))
                .doOnError(error -> System.out.println("so sorry about " + error.getMessage()))
                .doOnComplete(()-> System.out.println("Thanks for all your hard work! "))
                .map(Dish::deliver);}


}
