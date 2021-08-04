package net.litecj702.UserService.dish;


/**
 * 구독(subscription)을 하기 전에는 어떤 연산도 일어나지 않는다.
 * '...'파라미터가 여러가지 일 경우 압축 표현
 *
 * */
public class PoliteRestaurant {

    public static void main(String... args){
        PoliteServer server =
                new PoliteServer(new KitchenService());

        server.doingMyjob().subscribe(
                dish -> System.out.println("Consuming"+dish),
                throwable -> System.out.println(throwable));}
}
